package com.dreamtale.common.api;

/**
 * Created by yingshuai on 2017/12/24.
 */
public enum ErrorCode {

    BASE_ERROR(1001,"常规错误")

    ;

    private int index;

    private String desc;

    ErrorCode(int index, String desc){
        this.index = index;
        this.desc = desc;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
