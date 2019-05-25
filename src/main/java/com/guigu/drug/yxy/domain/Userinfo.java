package com.guigu.drug.yxy.domain;

public class Userinfo {
    private int userid;
    private String username;
    private String account;
    private String password;
    private String sex;
    private int age;
    private String phone;
    private int rid;
    private int did;
    private String rname;
    private String dname;
    private String workstate;

    public Userinfo() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getWorkstate() {
        return workstate;
    }

    public void setWorkstate(String workstate) {
        this.workstate = workstate;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public Userinfo(int userid, String username, String account, String password, String sex, int age, String phone, int rid, int did, String rname, String dname, String workstate) {
        this.userid = userid;
        this.username = username;
        this.account = account;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.rid = rid;
        this.did = did;
        this.rname = rname;
        this.dname = dname;
        this.workstate = workstate;
    }

    @Override
    public String toString() {
        return "Userinfo{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", rid=" + rid +
                ", tid=" + did +
                ", rname='" + rname + '\'' +
                ", dname='" + dname + '\'' +
                ", workstate='" + workstate + '\'' +
                '}';
    }
}
