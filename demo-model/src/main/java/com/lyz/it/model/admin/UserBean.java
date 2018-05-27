package com.lyz.it.model.admin;

import com.lyz.it.model.common.BaseBean;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.io.Serializable;
import java.util.Date;

/**
 * td_b_sys_user
 * @author 
 */
public class UserBean extends BaseBean<Integer> implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userId;

    private String userName;

    private String password;

    private Integer userStatus;


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

}