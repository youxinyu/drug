package com.guigu.drug.pojo;

public class lll {
    private int id;
    private  String name;
    private String sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public lll() {
        super();
    }

    public lll(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }
}
