package com.lyz.it.common.exception;

/**
 * @Author:LYZ
 * @Description:
 * @Date:Created in 13:10 2018/5/27
 * @Modified By:
 */
public enum ExceptionEnum {

    /** 缺少参数 */
    MISSING_PARAMS(1001),

    /** 格式不正确 */
    PARAMS_FORMAT(1002),

    /** 非法参数 */
    ILLEGAL_PARAMS(1003),

    /**添加失败*/
    ADD_FAIL(1004),

    /**修改失败*/
    UPDATE_FAIL(1005),

    /**删除失败*/
    DELETE_FAIL(1006),

    /**未知异常*/
    SERVER_ERROR(500),

    /**不存在*/
    NOT_EXIT_ERROR(1007),

    /**已存在*/
    ALREADY_EXIT_ERROR(1008);


    private int returnCode;

    ExceptionEnum(int returnCode) {
        this.returnCode = returnCode;
    }

    public int toInt() {
        return this.returnCode;
    }

    public int code() {
        return this.returnCode;
    }
}
