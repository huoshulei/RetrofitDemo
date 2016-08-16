package com.feicuiedu.retrofitdemo;

/**
 * 作者：yuanchao on 2016/8/15 0015 14:22
 * 邮箱：yuanchao@feicuiedu.com
 */
public class User {

//    {
//        "username" : username,   // 用户名
//            "password" : password    // 密码
//    }

    private String username = "test2";// 用户名

    private String password = "123456";// 密码

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
