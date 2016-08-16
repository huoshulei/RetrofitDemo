package com.feicuiedu.retrofitdemo;

public class UserResult {

//    {
//        "createdAt": YYYY-mm-dd HH:ii:ss,    // 用户注册时间
//            "objectId": objectId,                // 用户唯一Id
//            "sessionToken": sessionToken         // 用来认证更新或删除用户的请求
//    }

    private String objectId;

    private String sessionToken;

    public String getSessionToken() {
        return sessionToken;
    }

    public String getObjectId() {
        return objectId;
    }
}
