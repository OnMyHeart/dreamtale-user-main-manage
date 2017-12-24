package com.dreamtale.common.api;

import java.io.Serializable;

/**
 * 接口数据返回类
 * Created by yingshuai on 2017/12/24.
 */
public class ResultJson<T> implements Serializable {

    private int code;

    private String message;

    private String detail;

    private T result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
