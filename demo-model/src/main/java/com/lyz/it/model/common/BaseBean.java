package com.lyz.it.model.common;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author:LYZ
 * @Description:
 * @Date:Created in 12:50 2018/5/27
 * @Modified By:
 */
public class BaseBean<ID> implements  Serializable {

    private static final long serialVersionUID = 3497498620653475654L;
    /**
     * 主键id
     */
    protected ID id;

    /**
     * 状态
     */
    protected ID status;
    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    protected Date createDate;
    /**
     * 修改时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    protected Date modifyDate;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public ID getStatus() {
        return status;
    }

    public void setStatus(ID status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}
