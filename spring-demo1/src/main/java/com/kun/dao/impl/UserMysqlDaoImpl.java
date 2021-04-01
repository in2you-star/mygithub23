package com.kun.dao.impl;

import com.kun.dao.UserDao;

public class UserMysqlDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("使用mysql数据库管理用户");
    }
}
