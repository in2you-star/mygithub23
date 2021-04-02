package com.kun.pojo;

public class Emp {
    private int id;
    private String name;

    public Emp() {
        System.out.println("基本构造方法");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(id+name);
    }
}
