package com.lyz.it.dao.mapper.admin;

import com.lyz.it.apimodel.admin.UserQuery;
import com.lyz.it.model.admin.UserBean;

public interface UserMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(UserQuery record);

    int insertSelective(UserQuery record);

    UserBean selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserQuery record);

    int updateByPrimaryKey(UserQuery record);
}