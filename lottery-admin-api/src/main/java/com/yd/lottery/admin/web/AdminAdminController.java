package com.yd.lottery.admin.web;

import com.github.pagehelper.PageInfo;
import com.yd.lottery.admin.annotation.RequiresPermissionsDesc;
import com.yd.lottery.admin.service.LogHelper;
import com.yd.lottery.admin.service.SysAdminService;
import com.yd.lottery.admin.utils.AdminResponseCode;
import com.yd.lottery.core.util.RegexUtil;
import com.yd.lottery.core.util.ResponseUtil;
import com.yd.lottery.core.util.bcrypt.BCryptPasswordEncoder;
import com.yd.lottery.core.validator.Order;
import com.yd.lottery.core.validator.Sort;
import com.yd.lottery.db.domain.SysAdmin;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("/api/admin/admin")
@Validated
public class AdminAdminController {

    @Autowired
    private SysAdminService adminService;
    @Autowired
    private LogHelper logHelper;

    @RequiresPermissions("admin:admin:list")
    @RequiresPermissionsDesc(menu = {"系统管理", "管理员管理"}, button = "查询")
    @GetMapping("/list")
    public Object list(String username,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "create_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        PageInfo<SysAdmin> sysAdminPageInfo = adminService.querySelective(username, page, limit, sort, order);
        return ResponseUtil.okPage(sysAdminPageInfo);
    }

    private Object validate(SysAdmin admin) {
        String name = admin.getUsername();
        if (StringUtils.isEmpty(name)) {
            return ResponseUtil.badArgument();
        }
        if (!RegexUtil.isUsername(name)) {
            return ResponseUtil.fail(AdminResponseCode.ADMIN_INVALID_NAME, "管理员名称不符合规定");
        }
        String password = admin.getPassword();
        if (StringUtils.isEmpty(password) || password.length() < 6) {
            return ResponseUtil.fail(AdminResponseCode.ADMIN_INVALID_PASSWORD, "管理员密码长度不能小于6");
        }
        return null;
    }

    @RequiresPermissions("admin:admin:create")
    @RequiresPermissionsDesc(menu = {"系统管理", "管理员管理"}, button = "添加")
    @PostMapping("/create")
    public Object create(@RequestBody SysAdmin admin) {
        Object error = validate(admin);
        if (error != null) {
            return error;
        }

        String username = admin.getUsername();
        List<SysAdmin> adminList = adminService.findAdmin(username);
        if (adminList.size() > 0) {
            return ResponseUtil.fail(AdminResponseCode.ADMIN_NAME_EXIST, "管理员已经存在");
        }

        String rawPassword = admin.getPassword();
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(rawPassword);
        admin.setPassword(encodedPassword);
        adminService.add(admin);
        logHelper.logAuthSucceed("添加管理员", username);
        return ResponseUtil.ok(admin);
    }

    @RequiresPermissions("admin:admin:read")
    @RequiresPermissionsDesc(menu = {"系统管理", "管理员管理"}, button = "详情")
    @GetMapping("/read")
    public Object read(@NotNull Long id) {
        SysAdmin admin = adminService.findById(id);
        return ResponseUtil.ok(admin);
    }

    @RequiresPermissions("admin:admin:update")
    @RequiresPermissionsDesc(menu = {"系统管理", "管理员管理"}, button = "编辑")
    @PostMapping("/update")
    public Object update(@RequestBody SysAdmin admin) {
        Object error = validate(admin);
        if (error != null) {
            return error;
        }

        Long anotherAdminId = admin.getKid();
        if (anotherAdminId == null) {
            return ResponseUtil.badArgument();
        }

        // 不允许管理员通过编辑接口修改密码
        admin.setPassword(null);

        if (adminService.updateById(admin) == 0) {
            return ResponseUtil.updatedDataFailed();
        }

        logHelper.logAuthSucceed("编辑管理员", admin.getUsername());
        return ResponseUtil.ok(admin);
    }

    @RequiresPermissions("admin:admin:delete")
    @RequiresPermissionsDesc(menu = {"系统管理", "管理员管理"}, button = "删除")
    @PostMapping("/delete")
    public Object delete(@RequestBody SysAdmin admin) {
        Long anotherAdminId = admin.getKid();
        if (anotherAdminId == null) {
            return ResponseUtil.badArgument();
        }

        // 管理员不能删除自身账号
        Subject currentUser = SecurityUtils.getSubject();
        SysAdmin currentAdmin = (SysAdmin) currentUser.getPrincipal();
        if (currentAdmin.getKid().equals(anotherAdminId)) {
            return ResponseUtil.fail(AdminResponseCode.ADMIN_DELETE_NOT_ALLOWED, "管理员不能删除自己账号");
        }

        adminService.deleteById(anotherAdminId);
        logHelper.logAuthSucceed("删除管理员", admin.getUsername());
        return ResponseUtil.ok();
    }
}
