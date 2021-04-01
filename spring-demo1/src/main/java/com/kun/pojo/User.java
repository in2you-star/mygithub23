package com.kun.pojo;

public class User {
    private int uid;
    private String uname;

    public User() {
        System.out.println("无参构造方法");
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void show(){
        System.out.println("uid="+uid);
        System.out.println("uname="+uname);
    }
}
