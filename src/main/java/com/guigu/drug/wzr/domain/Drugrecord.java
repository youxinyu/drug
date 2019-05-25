package com.guigu.drug.wzr.domain;
/*
* 采购入库类
* */
public class Drugrecord {
    private Integer rdid;//采购编号
    private int drugid;//药品编号
    private int supplierid;//供应商编号
    private int userid;//用户编号
    private int rquantity;//采购数量
    private int rprice;//采购的总价格
    private int rdate;//采购时间
    private int rstatus;//采购状态

    private Druginfo d;//药品类
    private Supplierinfo s;//供应商类
    private Userinfo u;//用户类
    private Styledrug g;//药品类型类

    @Override
    public String toString() {
        return "Drugrecord{" +
                "rdid=" + rdid +
                ", drugid=" + drugid +
                ", supplierid=" + supplierid +
                ", userid=" + userid +
                ", rquantity=" + rquantity +
                ", rprice=" + rprice +
                ", rdate=" + rdate +
                ", rstatus=" + rstatus +
                ", d=" + d +
                ", s=" + s +
                ", u=" + u +
                ", g=" + g +
                '}';
    }

    public Integer getRdid() {
        return rdid;
    }

    public void setRdid(Integer rdid) {
        this.rdid = rdid;
    }

    public int getDrugid() {
        return drugid;
    }

    public void setDrugid(int drugid) {
        this.drugid = drugid;
    }

    public int getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(int supplierid) {
        this.supplierid = supplierid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getRquantity() {
        return rquantity;
    }

    public void setRquantity(int rquantity) {
        this.rquantity = rquantity;
    }

    public int getRprice() {
        return rprice;
    }

    public void setRprice(int rprice) {
        this.rprice = rprice;
    }

    public int getRdate() {
        return rdate;
    }

    public void setRdate(int rdate) {
        this.rdate = rdate;
    }

    public int getRstatus() {
        return rstatus;
    }

    public void setRstatus(int rstatus) {
        this.rstatus = rstatus;
    }

    public Druginfo getD() {
        return d;
    }

    public void setD(Druginfo d) {
        this.d = d;
    }

    public Supplierinfo getS() {
        return s;
    }

    public void setS(Supplierinfo s) {
        this.s = s;
    }

    public Userinfo getU() {
        return u;
    }

    public void setU(Userinfo u) {
        this.u = u;
    }

    public Styledrug getG() {
        return g;
    }

    public void setG(Styledrug g) {
        this.g = g;
    }

    public Drugrecord() {
    }

    public Drugrecord(Integer rdid, int drugid, int supplierid, int userid, int rquantity, int rprice, int rdate, int rstatus, Druginfo d, Supplierinfo s, Userinfo u, Styledrug g) {
        this.rdid = rdid;
        this.drugid = drugid;
        this.supplierid = supplierid;
        this.userid = userid;
        this.rquantity = rquantity;
        this.rprice = rprice;
        this.rdate = rdate;
        this.rstatus = rstatus;
        this.d = d;
        this.s = s;
        this.u = u;
        this.g = g;
    }
}
