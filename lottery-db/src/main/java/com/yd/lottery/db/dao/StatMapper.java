package com.yd.lottery.db.dao;

import java.util.List;
import java.util.Map;

public interface StatMapper {
    List<Map> statUser();

    List<Map> statOrder();

    List<Map> statGoods();

    /**
     * 累计参与总人次
     *
     * @return
     */
    Long totalCountJoined();

    /**
     * 累计打卡总人次
     *
     * @return
     */
    Long totalCountClocked();

    /**
     * 今日参与人数
     *
     * @return
     */
    Long todayTakeInCount();

}
