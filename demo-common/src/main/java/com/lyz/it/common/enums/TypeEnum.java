package com.lyz.it.common.enums;

/**
 * @Author:LYZ
 * @Description:
 * @Date:Created in 13:22 2018/5/27
 * @Modified By:
 */
public enum TypeEnum implements IEnum{
    TYPE_ADD(0,"add","添加");

    private int key;
    private String code;
    private String desc;


    TypeEnum(int key, String code, String desc) {
        this.key = key;
        this.code = code;
        this.desc = desc;
    }

    @Override
    public int value() {
        return key;
    }

    @Override
    public String describle() {
        return desc;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
