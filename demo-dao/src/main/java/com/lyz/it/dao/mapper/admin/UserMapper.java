package com.lyz.it.dao.mapper.admin;

import com.lyz.it.model.admin.UserBean;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(UserBean record);

    int insertSelective(UserBean record);

    UserBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserBean record);

    int updateByPrimaryKey(UserBean record);
}