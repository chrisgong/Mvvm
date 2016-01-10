package com.cim120.retrofitstudy.utils;

import com.orhanobut.logger.Logger;

/**
 * Created by chrisgong on 15/12/21.
 * 日志输出类
 */
public class CimLogger {

    /**
     * 初始化Logger
     */
    public static void init() {
        Logger.init("cim");
    }

    public static void xml(String xml) {
        com.orhanobut.logger.Logger.xml(xml);
    }

    public static void json(String json) {
        com.orhanobut.logger.Logger.json(json);
    }

    public static void wtf(String message, Object... args) {
        com.orhanobut.logger.Logger.wtf(message, args);
    }

    public static void w(String message, Object... args) {
        com.orhanobut.logger.Logger.w(message, args);
    }

    public static void v(String message, Object... args) {
        com.orhanobut.logger.Logger.v(message, args);
    }

    public static void i(String message, Object... args) {
        com.orhanobut.logger.Logger.i(message, args);
    }

    public static void e(Throwable throwable, String message, Object... args) {
        com.orhanobut.logger.Logger.e(throwable, message, args);
    }

    public static void e(String message, Object... args) {
        com.orhanobut.logger.Logger.e(message, args);
    }

    public static void d(String message, Object... args) {
        com.orhanobut.logger.Logger.d(message, args);
    }
}
