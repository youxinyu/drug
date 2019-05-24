package com.guigu.drug.wzr.domain;

public class Userinfo {

    private int userid;
    private String username;
    private String account;
    private String password;
    private String sex;
    private int age;
    private String phone;
    private int did;
    private String workstate;

    private Supplierinfo su;

    public Userinfo(int userid, String username, String account, String password, String sex, int age, String phone, int did, String workstate, Supplierinfo su) {
        this.userid = userid;
        this.username = username;
        this.account = account;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.did = did;
        this.workstate = workstate;
        this.su = su;
    }

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

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getWorkstate() {
        return workstate;
    }

    public void setWorkstate(String workstate) {
        this.workstate = workstate;
    }

    public Supplierinfo getSu() {
        return su;
    }

    public void setSu(Supplierinfo su) {
        this.su = su;
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
                ", did=" + did +
                ", workstate='" + workstate + '\'' +
                ", su=" + su +
                '}';
    }
}
