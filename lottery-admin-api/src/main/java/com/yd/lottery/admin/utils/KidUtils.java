package com.yd.lottery.admin.utils;

import cn.hutool.core.lang.Snowflake;
import cn.hutool.core.util.IdUtil;
import org.springframework.stereotype.Component;

@Component
public class KidUtils {
    static private Snowflake snowflake;

    static public long nextId() {
        if (null == snowflake) {
            long longIp = IpUtils.ipToLong(IpUtils.getRealIp());
            //取IP地址低第10-第6bit这5bit
            long mid = (longIp >> 5) & 31;
            //取IP地址低5bit
            long low = (longIp & 31);
            snowflake = IdUtil.getSnowflake(mid, low);
        }
        return snowflake.nextId();
    }
}
