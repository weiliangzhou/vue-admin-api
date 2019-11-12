package com.yd.lottery.admin.enums;

/**
 * @program: lottery-core
 * @description: 渠道枚举
 * @author: 二师兄
 * @create: 2019-10-22 10:39
 **/
public enum ChannelIdEnum {
    DK_10001("dk_10001", "打卡10001"),
    CJ_10001("cj_10001", "抽奖10001");
    private String code;
    private String desc;

    ChannelIdEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
