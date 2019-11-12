package com.yd.lottery.admin.web;

import com.github.pagehelper.PageInfo;
import com.yd.lottery.admin.annotation.RequiresPermissionsDesc;
import com.yd.lottery.admin.service.UserAddressService;
import com.yd.lottery.core.util.ResponseUtil;
import com.yd.lottery.core.validator.Order;
import com.yd.lottery.core.validator.Sort;
import com.yd.lottery.db.domain.UserAddress;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/address")
@Validated
public class AdminAddressController {

    @Autowired
    private UserAddressService userAddressService;

    @RequiresPermissions("admin:address:list")
    @RequiresPermissionsDesc(menu = {"用户管理", "收货地址"}, button = "查询")
    @GetMapping("/list")
    public Object list(@RequestParam(required = false) Long userKid,
                       @RequestParam(required = false) String name,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "create_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        PageInfo<UserAddress> userAddressPageInfo = userAddressService.querySelective(userKid, name, page, limit, sort, order);
        return ResponseUtil.okPage(userAddressPageInfo);
    }
}
