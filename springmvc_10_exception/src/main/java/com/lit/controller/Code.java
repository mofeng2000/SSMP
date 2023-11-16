package com.lit.controller;

public class Code {
    //成功
    public static final Integer SAVE_OK = 20011;
    public static final Integer DELETE_OK = 20021;
    public static final Integer UPDATE_OK = 20031;
    public static final Integer GET_OK = 20041;

    //失败
    public static final Integer SAVE_EER = 20010;
    public static final Integer DELETE_EER = 20020;
    public static final Integer UPDATE_EER = 20030;
    public static final Integer GET_EER = 20040;


    //异常处理
    public static final Integer SYSTEM_ERR=50001;
    public static final Integer SYSTEM_TIMEOUT_ERR=50002;
    public static final Integer BUSINESS_ERR=60001;
    public static final Integer SYSTEM_UNKNOW_ERR=59999;

}
