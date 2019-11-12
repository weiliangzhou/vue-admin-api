package com.yd.lottery.admin.web;

import com.yd.lottery.core.util.ResponseUtil;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/admin/dashboard")
@Validated
public class AdminDashbordController {


    @GetMapping("")
    public Object info() {
        int userTotal = 123;
        int goodsTotal = 345;
        int productTotal = 456;
        int orderTotal = 789;
        Map<String, Integer> data = new HashMap<>();
        data.put("userTotal", userTotal);
        data.put("goodsTotal", goodsTotal);
        data.put("productTotal", productTotal);
        data.put("orderTotal", orderTotal);

        return ResponseUtil.ok(data);
    }

}
