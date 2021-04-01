package com.kun.dao.impl;

import com.kun.dao.UserDao;

public class UserOracleDaoImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("使用oracle数据库管理用户");
    }
}
