package com.lyz.it.common.bean;

/**
 * @Author:LYZ
 * @Description:
 * @Date:Created in 13:07 2018/5/27
 * @Modified By:
 */
public class SuccessBean extends ErrorBean{
    private static final long serialVersionUID = 2070952676523020419L;

    private SuccessBean() {
        super(OK, "OK");
    }

    public static ErrorBean success() {
        return new SuccessBean();
    }

    public static ErrorBean err(String message) {
        return success();
    }

    public static ErrorBean err(int code, String message) {
        return success();
    }

    @Override
    public boolean isOk() {
        return true;
    }

    @Override
    public int getCode() {
        return OK;
    }

    @Override
    public String getMessage() {
        return "OK";
    }
}
