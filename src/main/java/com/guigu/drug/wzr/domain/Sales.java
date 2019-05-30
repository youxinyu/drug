package com.guigu.drug.wzr.domain;

/*
* 采购退货查询
* */
public class Sales {

    private Integer sid;//采购编号
    private int drugid;//药品编号
    private int supplierid;//供应商编号
    private int userid;//管理员编号
    private int squantity;//退货数量
    private double sprice;//退货金额
    private String stime;//退货时间

    private Supplierinfo o;//供应商类
    private Druginfo d;//药品类
    private Styledrug g;//药品类型类
    private Userinfo u;//管理员类

    @Override
    public String toString() {
        return "Sales{" +
                "sid=" + sid +
                ", drugid=" + drugid +
                ", supplierid=" + supplierid +
                ", userid=" + userid +
                ", squantity=" + squantity +
                ", sprice=" + sprice +
                ", stime='" + stime + '\'' +
                ", o=" + o +
                ", d=" + d +
                ", g=" + g +
                ", u=" + u +
                '}';
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
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

    public int getSquantity() {
        return squantity;
    }

    public void setSquantity(int squantity) {
        this.squantity = squantity;
    }

    public double getSprice() {
        return sprice;
    }

    public void setSprice(double sprice) {
        this.sprice = sprice;
    }

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public Supplierinfo getO() {
        return o;
    }

    public void setO(Supplierinfo o) {
        this.o = o;
    }

    public Druginfo getD() {
        return d;
    }

    public void setD(Druginfo d) {
        this.d = d;
    }

    public Styledrug getG() {
        return g;
    }

    public void setG(Styledrug g) {
        this.g = g;
    }

    public Userinfo getU() {
        return u;
    }

    public void setU(Userinfo u) {
        this.u = u;
    }

    public Sales() {
    }

    public Sales(Integer sid, int drugid, int supplierid, int userid, int squantity, double sprice, String stime, Supplierinfo o, Druginfo d, Styledrug g, Userinfo u) {
        this.sid = sid;
        this.drugid = drugid;
        this.supplierid = supplierid;
        this.userid = userid;
        this.squantity = squantity;
        this.sprice = sprice;
        this.stime = stime;
        this.o = o;
        this.d = d;
        this.g = g;
        this.u = u;
    }
}
