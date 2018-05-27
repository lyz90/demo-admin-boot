package com.lyz.it.apimodel.admin;

import com.lyz.it.apimodel.common.PageCondition;

import java.util.Date;

/**
 * @Author:LYZ
 * @Description:
 * @Date:Created in 12:45 2018/5/27
 * @Modified By:
 */
public class UserQuery extends PageCondition {

    private static final long serialVersionUID = 8411368840002470672L;
    private Integer id;

    private String userId;

    private String userName;

    private String password;

    private Integer userStatus;

    private Date createDate;

    private Date modifyDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
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
