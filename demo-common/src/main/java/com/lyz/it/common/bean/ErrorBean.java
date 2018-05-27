package com.lyz.it.common.bean;

import java.io.Serializable;

/**
 * @Author:LYZ
 * @Description:
 * @Date:Created in 13:04 2018/5/27
 * @Modified By:
 */
public class ErrorBean implements Serializable{
    private static final long serialVersionUID = 6495697525581813954L;

    protected static final int OK = 0;
    protected static final int ERROR = 1;

    private boolean ok = false;
    private int code;
    private String message;

    public ErrorBean() {
    }

    public ErrorBean(int code, String message) {
        this.code = code;
        this.message = message;
        this.ok = code == OK;
    }

    public static ErrorBean err(String message) {
        return new ErrorBean(ERROR, message);
    }

    public static ErrorBean err(int code, String message) {
        return new ErrorBean(code, message);
    }

    public boolean isOk() {
        this.ok = (code == OK);
        return ok;
    }

    protected void setOk(boolean ok) {
        this.ok = ok;
    }

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
}
