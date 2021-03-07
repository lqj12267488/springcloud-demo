package com.wintop.springcloudproducer2.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回数据封装 Result
 * @Author guanhuimin
 */
public class Result extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    public Result() {
        put("code", 0);
    }

    public Result(int code, String msg, Object data){
        put("code", code);
        put("msg", msg);
        put("data", data);
    }

    public static Result error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static Result error(String msg) {
        return error(500, msg);
    }


    public static Result error(int code, String msg) {
        Result r = new Result();
        r.put("code", code);
        r.put("msg", msg);
        r.put("data", null);
        return r;
    }

    public static Result ok(String msg, Object data) {
        Result r = new Result();
        r.put("code", 200);
        r.put("msg", msg);
        r.put("data", data);
        return r;
    }

    public static Result ok(Object data) {
        Result r = new Result();
        r.put("code", 200);
        r.put("msg", "success");
        r.put("data", data);
        return r;
    }

    public static Result ok(Map<String, Object> map) {
        Result r = new Result();
        r.put("code", 200);
        r.put("msg", "success");
        r.putAll(map);
        return r;
    }

    public static Result ok() {
        return new Result(200,"success",null);
    }

    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
