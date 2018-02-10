package com.frank.demo.center.exception;

import com.frank.demo.center.content.EnumRespCode;

/**
 * Created by yangxb on 2018/2/10.
 */
public class BaseException extends Throwable {
    private String code;
    private String errorMsg;

    public BaseException(EnumRespCode resp) {
        this.code = resp.getValue();
        this.errorMsg = resp.getDesc();
    }

    public BaseException(String code, String errorMsg) {
        this.code = code;
        this.errorMsg = errorMsg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
