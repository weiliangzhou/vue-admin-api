package com.yd.lottery.admin.web;

import com.github.pagehelper.PageInfo;
import com.yd.lottery.admin.annotation.RequiresPermissionsDesc;
import com.yd.lottery.admin.dto.PrizeAddDTO;
import com.yd.lottery.admin.dto.PrizeInfoDTO;
import com.yd.lottery.admin.dto.PrizeUpdateDTO;
import com.yd.lottery.admin.service.PrizeService;
import com.yd.lottery.core.util.ResponseUtil;
import com.yd.lottery.core.validator.Order;
import com.yd.lottery.core.validator.Sort;
import com.yd.lottery.db.domain.Prize;
import com.yd.lottery.db.domain.UserBase;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@Validated
public class AdminPrizeController {

    @Autowired
    private PrizeService prizeService;

    /**
     * @api {GET} /api/admin/prize/list 抽奖列表
     * @apiVersion 1.0.0
     * @apiGroup AdminPrizeController
     * @apiName list
     * @apiParam (请求参数) {String} name
     * @apiParam (请求参数) {Number} page
     * @apiParam (请求参数) {Number} limit
     * @apiParam (请求参数) {Object} startTime
     * @apiParam (请求参数) {Object} endTime
     * @apiParam (请求参数) {String} sort
     * @apiParam (请求参数) {String} order
     * @apiParamExample 请求参数示例
     * name=cPqxbqXY&limit=6861&startTime=null&page=3373&endTime=null&sort=Fvh&order=j0v7Hxd
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequiresPermissions("admin:prize:list")
    @RequiresPermissionsDesc(menu = {"抽奖管理", "抽奖列表"}, button = "查询")
    @GetMapping("/api/admin/prize/list")
    public Object list(String name,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @RequestParam(required = false) LocalDateTime startTime,
                       @RequestParam(required = false) LocalDateTime endTime,
                       @Sort @RequestParam(defaultValue = "create_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        PageInfo<Prize> list = prizeService.list(name, startTime, endTime, page, limit, sort, order);
        return ResponseUtil.okPage(list);
    }

    /**
     * @api {GET} /api/admin/prize/read 抽奖详情
     * @apiVersion 1.0.0
     * @apiGroup AdminPrizeController
     * @apiName read
     * @apiDescription 抽奖详情
     * @apiParam (请求参数) {Number} kid 抽奖kid
     * @apiParamExample 请求参数示例
     * kid=8969
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequiresPermissions("admin:prize:read")
    @RequiresPermissionsDesc(menu = {"抽奖管理", "抽奖列表"}, button = "详情")
    @GetMapping("/api/admin/prize/read")
    public Object read(@RequestParam Long kid) {
        PrizeInfoDTO byKid = prizeService.findByKid(kid);
        return ResponseUtil.ok(byKid);
    }


    /**
     * @api {POST} /api/admin/prize/add 添加抽奖
     * @apiVersion 1.0.0
     * @apiGroup AdminPrizeController
     * @apiName add
     * @apiParam (请求体) {String} name 名称
     * @apiParam (请求体) {Number} marketPrice 市场价格
     * @apiParam (请求体) {Number} costPrice 成本价格
     * @apiParam (请求体) {String} imgUrl1
     * @apiParam (请求体) {String} imgUrl2
     * @apiParam (请求体) {String} imgUrl3
     * @apiParam (请求体) {String} desc 描述
     * @apiParam (请求体) {Number} drawState 0已结束      1待开奖
     * @apiParam (请求体) {Object} startTime 开始参与时间
     * @apiParam (请求体) {Object} endTime 截止时间
     * @apiParam (请求体) {Object} drawTime 开奖时间
     * @apiParam (请求体) {Number} displayState 显示状态      0隐藏      1显示
     * @apiParam (请求体) {Number} limitCountMin 最低参与人数   -1不限制
     * @apiParam (请求体) {Number} limitCountMax 最高参与人数   -1不限制
     * @apiParam (请求体) {Number} limitType 0无条件      1看广告
     * @apiParam (请求体) {Number} activityType 0限人      1限时      2限时限人
     * @apiParam (请求体) {Number} playerCount 参与人数
     * @apiParam (请求体) {Number} playerCountInit 初始参与人数
     * @apiParamExample 请求体示例
     * {"marketPrice":3536,"limitCountMax":2103,"imgUrl2":"BUKb","playerCountInit":5066,"imgUrl3":"RpjGi7i","playerCount":4043,"imgUrl1":"9bPqE","costPrice":203,"limitCountMin":4883,"limitType":9170,"displayState":4674,"name":"5EcxA","drawState":2599,"activityType":971,"desc":"P"}
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequiresPermissions("admin:prize:create")
    @RequiresPermissionsDesc(menu = {"抽奖管理", "添加抽奖"}, button = "添加")
    @PostMapping("/api/admin/prize/create")
    public Object create(@RequestBody PrizeAddDTO prizeAddDTO) {
        prizeService.add(prizeAddDTO);
        return ResponseUtil.ok();
    }

    /**
     * @api {POST} /api/admin/prize/update 编辑抽奖
     * @apiVersion 1.0.0
     * @apiGroup AdminPrizeController
     * @apiName update
     * @apiParam (请求体) {Number} kid
     * @apiParam (请求体) {String} name 名称
     * @apiParam (请求体) {Number} marketPrice 市场价格
     * @apiParam (请求体) {Number} costPrice 成本价格
     * @apiParam (请求体) {String} imgUrl1
     * @apiParam (请求体) {String} imgUrl2
     * @apiParam (请求体) {String} imgUrl3
     * @apiParam (请求体) {String} desc 描述
     * @apiParam (请求体) {Number} drawState 0已结束      1待开奖
     * @apiParam (请求体) {Object} startTime 开始参与时间
     * @apiParam (请求体) {Object} endTime 截止时间
     * @apiParam (请求体) {Object} drawTime 开奖时间
     * @apiParam (请求体) {Number} displayState 显示状态      0隐藏      1显示
     * @apiParam (请求体) {Number} limitCountMin 最低参与人数   -1不限制
     * @apiParam (请求体) {Number} limitCountMax 最高参与人数   -1不限制
     * @apiParam (请求体) {Number} limitType 0无条件      1看广告
     * @apiParam (请求体) {Number} activityType 0限人      1限时      2限时限人
     * @apiParam (请求体) {Number} playerCount 参与人数
     * @apiParam (请求体) {Number} playerCountInit 初始参与人数
     * @apiParamExample 请求体示例
     * {"marketPrice":3329,"limitCountMax":4063,"imgUrl2":"Zm","playerCountInit":2868,"imgUrl3":"wX","playerCount":5542,"kid":640,"imgUrl1":"IDsiMra0No","costPrice":5419,"limitCountMin":4210,"limitType":3947,"displayState":7182,"name":"AobSD","drawState":9986,"activityType":1496,"desc":"LJ"}
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequiresPermissions("admin:prize:update")
    @RequiresPermissionsDesc(menu = {"抽奖管理", "编辑抽奖"}, button = "编辑")
    @PostMapping("/api/admin/prize/update")
    public Object update(@RequestBody PrizeUpdateDTO prizeUpdateDTO) {
        prizeService.update(prizeUpdateDTO);
        return ResponseUtil.ok();
    }

    /**
     * @api {GET} /api/admin/prize/open_prize 开奖
     * @apiVersion 1.0.0
     * @apiGroup AdminPrizeController
     * @apiName openPrize
     * @apiParam (请求参数) {Number} type
     * @apiParam (请求参数) {Number} userKid
     * @apiParam (请求参数) {Number} prizeKid
     * @apiParamExample 请求参数示例
     * userKid=4943&prizeKid=1282&type=4964
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequiresPermissions("admin:prize:open")
    @RequiresPermissionsDesc(menu = {"抽奖管理", "开奖"}, button = "开奖")
    @GetMapping("/api/admin/prize/open_prize")
    public Object openPrize(
            @RequestParam Integer type,
            @RequestParam(required = false) Long userKid,
            @RequestParam Long prizeKid
    ) {
        prizeService.openPrize(type, prizeKid, userKid);
        return ResponseUtil.ok();
    }

    /**
     * @api {GET} /api/admin/prize/view_winner 查看中奖结果
     * @apiVersion 1.0.0
     * @apiGroup AdminPrizeController
     * @apiName viewWinner
     * @apiParam (请求参数) {Number} prizeKid
     * @apiParamExample 请求参数示例
     * prizeKid=3474
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequiresPermissions("admin:prize:view_winner")
    @RequiresPermissionsDesc(menu = {"抽奖管理", "查看中奖结果"}, button = "查看中奖结果")
    @GetMapping("/api/admin/prize/view_winner")
    public Object viewWinner(
            @RequestParam Long prizeKid
    ) {
        UserBase userBase = prizeService.viewWinner(prizeKid);
        return ResponseUtil.ok(userBase);
    }

    /**
     * @api {GET} /api/admin/prize/delete 抽奖删除
     * @apiVersion 1.0.0
     * @apiGroup AdminPrizeController
     * @apiName delete
     * @apiDescription 抽奖删除
     * @apiParam (请求参数) {Number} kid
     * @apiParamExample 请求参数示例
     * kid=7763
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequiresPermissions("admin:prize:delete")
    @RequiresPermissionsDesc(menu = {"抽奖管理", "删除奖品"}, button = "删除")
    @GetMapping("/api/admin/prize/delete")
    public Object delete(@RequestParam Long kid) {
        prizeService.deleteByKid(kid);
        return ResponseUtil.ok();
    }

    /**
     * @api {GET} /api/admin/prize/display 抽奖上下架
     * @apiVersion 1.0.0
     * @apiGroup AdminPrizeController
     * @apiName display
     * @apiDescription 抽奖上下架
     * @apiParam (请求参数) {Number} kid
     * @apiParamExample 请求参数示例
     * kid=4446
     * @apiSuccess (响应结果) {Object} response
     * @apiSuccessExample 响应结果示例
     * {}
     */
    @RequiresPermissions("admin:prize:display")
    @RequiresPermissionsDesc(menu = {"抽奖管理", "奖品上下架"}, button = "上下架")
    @GetMapping("/api/admin/prize/display")
    public Object display(@RequestParam Long kid) {
        prizeService.displayByKid(kid);
        return ResponseUtil.ok();
    }
}
