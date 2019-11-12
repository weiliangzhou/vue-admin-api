package com.yd.lottery.core.exception;

/**
 * @author 二师兄超级帅
 * @Title:
 * @Description: TODO
 * @date 2019/1/2614:05
 */
public enum ErrorEnum {
    //用户错误
    NO_USER(10001,"用户不存在"),
    NO_TAKE_PRIZE(10002,"该用户未参与本次抽奖"),
    //抽奖错误
    ALREADY_OPEN_PRIZE(20001, "已经开过奖了"),
    ALREADY_CANNOT_DELETED(20002, "有用户参与,不能删除"),
    UPPER_LOWER_FRAMES(20003, "有用户参与,不能下架"),
    ALREADY_CLOSE_PRIZE(20004, "没有用户参与,不能开奖"),
    LESS_PEOPLES_PRIZE(20005, "人数不够,不能开奖");

    private int code;
    private String msg;

    ErrorEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
