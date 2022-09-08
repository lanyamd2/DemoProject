package com.example.DemoProject.Model;

public class Boss {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boss(){}//empty constructor

    public Boss(int id, String name, int age){//parameterized constructor
        this.id=id;
        this.name=name;
        this.age=age;
    }



}
