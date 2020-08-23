package com.example.demo.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ResponseFormat implements Serializable {
    private static final long serialVersionUID = 6026253555471708086L;

    private String code;

    private String msg;

    private Object data;

    public ResponseFormat() {}

    public ResponseFormat(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static String success() {
        ResponseFormat ResponseFormat = new ResponseFormat();
        ResponseFormat.setCode(ResponseCode.SUCCESS);
        return ResponseFormat.toString();
    }

    public static String success(Object data) {
        ResponseFormat ResponseFormat = new ResponseFormat();
        ResponseFormat.setCode(ResponseCode.SUCCESS);
        ResponseFormat.setData(data);
        return ResponseFormat.toString();
    }

    public static String error(String code, String msg) {
        ResponseFormat ResponseFormat = new ResponseFormat();
        ResponseFormat.setCode(code);
        ResponseFormat.setMsg(msg);
        return ResponseFormat.toString();
    }

    public static String error(String code, String msg, Object data) {
        ResponseFormat ResponseFormat = new ResponseFormat();
        ResponseFormat.setCode(code);
        ResponseFormat.setMsg(msg);
        ResponseFormat.setData(data);
        return ResponseFormat.toString();
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(final Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        Map result = new HashMap();
        result.put("code",code);
        result.put("result",data);
        return result.toString();
    }
}
