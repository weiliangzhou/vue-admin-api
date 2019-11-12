package com.yd.lottery.admin.web;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class AdminStatController {

//
//    @RequiresPermissions("admin:stat:user")
//    @RequiresPermissionsDesc(menu = {"统计管理", "打卡用户统计"}, button = "查询")
//    @GetMapping("/api/admin/stat/user")
//    public Object statUser() {
//        List<Map> rows = statService.statUser();
//        String[] columns = new String[]{"day", "users"};
//        StatVo statVo = new StatVo();
//        statVo.setColumns(columns);
//        statVo.setRows(rows);
//        return ResponseUtil.ok(statVo);
//    }


}
