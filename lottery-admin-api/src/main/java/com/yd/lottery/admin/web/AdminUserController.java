package com.yd.lottery.admin.web;

import com.github.pagehelper.PageInfo;
import com.yd.lottery.admin.annotation.RequiresPermissionsDesc;
import com.yd.lottery.admin.dto.UserInfoDTO;
import com.yd.lottery.admin.service.UserBaseService;
import com.yd.lottery.core.util.ResponseUtil;
import com.yd.lottery.core.validator.Order;
import com.yd.lottery.core.validator.Sort;
import com.yd.lottery.db.domain.UserBase;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@Validated
public class AdminUserController {

    @Autowired
    private UserBaseService userBaseService;

    /**
     * @api {GET} /api/admin/user/list 用户列表
     * @apiVersion 1.0.0
     * @apiGroup user
     * @apiName list
     * @apiParam (请求参数) {String} nickname
     * @apiParam (请求参数) {Number} page
     * @apiParam (请求参数) {Number} limit
     * @apiParam (请求参数) {Object} startTime
     * @apiParam (请求参数) {Object} endTime
     * @apiParam (请求参数) {String} sort
     * @apiParam (请求参数) {String} order
     * @apiParamExample 请求参数示例
     * nickname=vO0XOmay4P&limit=2626&startTime=null&page=9421&endTime=null&sort=hAJSnnG5az&order=TX4PAkuBS
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequiresPermissions("admin:user:list")
    @RequiresPermissionsDesc(menu = {"用户管理", "会员管理"}, button = "查询")
    @GetMapping("/api/admin/user/list")
    public Object list(@RequestParam(required = false)String nickname,
                       @RequestParam(required = false)String phone,
                       @RequestParam(required = false)Long kid,
                       @RequestParam(required = false)String channelId,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @RequestParam(required = false) LocalDateTime startTime,
                       @RequestParam(required = false) LocalDateTime endTime,
                       @Sort @RequestParam(defaultValue = "create_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        PageInfo<UserInfoDTO> list = userBaseService.list(nickname, phone, kid, startTime, endTime, channelId, page, limit, sort, order);
        return ResponseUtil.okPage(list);
    }


    /**
     * @api {GET} /api/admin/user/read 用户详情
     * @apiVersion 1.0.0
     * @apiGroup user
     * @apiName read
     * @apiDescription 用户详情
     * @apiParam (请求参数) {Number} kid 用户kid
     * @apiParamExample 请求参数示例
     * kid=4881
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequiresPermissions("admin:user:read")
    @RequiresPermissionsDesc(menu = {"用户管理", "会员管理"}, button = "详情")
    @GetMapping("/api/admin/user/read")
    public Object read(@NotNull Long kid) {
        UserBase userBase = userBaseService.findByKid(kid);
        return ResponseUtil.ok(userBase);
    }


}
