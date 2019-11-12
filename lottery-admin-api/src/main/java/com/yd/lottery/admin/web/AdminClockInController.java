package com.yd.lottery.admin.web;

import com.github.pagehelper.PageInfo;
import com.yd.lottery.admin.annotation.RequiresPermissionsDesc;
import com.yd.lottery.admin.dto.ClockInTotalDTO;
import com.yd.lottery.admin.dto.UserInfoDTO;
import com.yd.lottery.admin.enums.ChannelIdEnum;
import com.yd.lottery.admin.service.StatService;
import com.yd.lottery.admin.service.UserBaseService;
import com.yd.lottery.core.util.ResponseUtil;
import com.yd.lottery.core.validator.Order;
import com.yd.lottery.core.validator.Sort;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @program: litemall
 * @description: 打卡管理
 * @author: 二师兄
 * @create: 2019-10-22 15:52
 **/
@RestController
@Validated
public class AdminClockInController {

    @Autowired
    private UserBaseService userBaseService;
    @Autowired
    private StatService statService;

    @RequiresPermissions("admin:clockin:user:list")
    @RequiresPermissionsDesc(menu = {"打卡管理", "会员列表"}, button = "查询")
    @GetMapping("/api/admin/clockin/user/list")
    public Object list(@RequestParam(required = false) String nickname,
                       @RequestParam(required = false) String phone,
                       @RequestParam(required = false) Long kid,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @RequestParam(required = false) LocalDateTime startTime,
                       @RequestParam(required = false) LocalDateTime endTime,
                       @Sort @RequestParam(defaultValue = "create_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        PageInfo<UserInfoDTO> list = userBaseService.list(nickname, phone, kid, startTime, endTime, ChannelIdEnum.DK_10001.getCode(), page, limit, sort, order);
        return ResponseUtil.okPage(list);
    }


    @RequiresPermissions("admin:clockin:user:info")
    @RequiresPermissionsDesc(menu = {"打卡管理", "用户统计"}, button = "查询")
    @GetMapping("/api/admin/clockin/user/info")
    public Object statUser() {
        ClockInTotalDTO clockInTotalDTO = statService.reqClockInTotalInfo();
        return ResponseUtil.ok(clockInTotalDTO);
    }
}
