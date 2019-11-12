package com.yd.lottery.admin.web;

import com.github.pagehelper.PageInfo;
import com.yd.lottery.admin.annotation.RequiresPermissionsDesc;
import com.yd.lottery.admin.service.SysLogService;
import com.yd.lottery.core.util.ResponseUtil;
import com.yd.lottery.core.validator.Order;
import com.yd.lottery.core.validator.Sort;
import com.yd.lottery.db.domain.SysLog;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin/log")
@Validated
public class AdminLogController {

    @Autowired
    private SysLogService logService;

    @RequiresPermissions("admin:log:list")
    @RequiresPermissionsDesc(menu = {"系统管理", "操作日志"}, button = "查询")
    @GetMapping("/list")
    public Object list(String name,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "create_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        PageInfo<SysLog> sysLogPageInfo = logService.querySelective(name, page, limit, sort, order);
        return ResponseUtil.okPage(sysLogPageInfo);
    }
}
