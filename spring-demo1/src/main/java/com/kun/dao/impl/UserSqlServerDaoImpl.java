package com.kun.dao.impl;

import com.kun.dao.UserDao;

public class UserSqlServerDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("使用sqlServer数据库管理用户");
    }
}
