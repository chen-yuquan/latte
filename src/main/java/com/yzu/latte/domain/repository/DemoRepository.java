package com.yzu.latte.domain.repository;

import com.yzu.latte.domain.model.User;

public interface DemoRepository {

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User login(User user);
}