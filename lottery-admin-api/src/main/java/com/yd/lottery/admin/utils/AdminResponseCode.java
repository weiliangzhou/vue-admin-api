package com.yd.lottery.admin.utils;

public interface AdminResponseCode {
     Integer ADMIN_INVALID_NAME = 601;
     Integer ADMIN_INVALID_PASSWORD = 602;
     Integer ADMIN_NAME_EXIST = 602;
     Integer ADMIN_ALTER_NOT_ALLOWED = 603;
     Integer ADMIN_DELETE_NOT_ALLOWED = 604;
     Integer ADMIN_INVALID_ACCOUNT = 605;
     Integer GOODS_UPDATE_NOT_ALLOWED = 610;
     Integer GOODS_NAME_EXIST = 611;
     Integer ORDER_CONFIRM_NOT_ALLOWED = 620;
     Integer ORDER_REFUND_FAILED = 621;
     Integer ORDER_REPLY_EXIST = 622;
     Integer USER_INVALID_NAME = 630;
     Integer USER_INVALID_PASSWORD = 631;
     Integer USER_INVALID_MOBILE = 632;
     Integer USER_NAME_EXIST = 633;
     Integer USER_MOBILE_EXIST = 634;
     Integer ROLE_NAME_EXIST = 640;
     Integer ROLE_SUPER_SUPERMISSION = 641;
     Integer ROLE_USER_EXIST = 642;




}
