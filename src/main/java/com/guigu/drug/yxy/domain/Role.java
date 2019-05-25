package com.guigu.drug.yxy.domain;

public class Role {
    private int rid;
    private String rname;
    private String desc;
    private int did;
    private String dname;

    public Role() {
    }

    public Role(int rid, String rname, String desc, int did, String dname) {
        this.rid = rid;
        this.rname = rname;
        this.desc = desc;
        this.did = did;
        this.dname = dname;
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

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", desc='" + desc + '\'' +
                ", did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }
}
