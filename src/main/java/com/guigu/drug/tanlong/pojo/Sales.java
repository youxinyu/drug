package com.guigu.drug.tanlong.pojo;

//退货记录实体类
public class Sales {

    private int sid; //退货记录id
    private int drugid; //药品 表 id
    private int supplierid; //供应商id
    private int userid; //经办人id
    private int squantity; //采购数量
    private double sprice;  //总价格
    private String stime; //退货时间

    public Sales(){

    }

    public Sales(int drugid, int supplierid, int userid, int squantity, double sprice, String stime) {
        this.drugid = drugid;
        this.supplierid = supplierid;
        this.userid = userid;
        this.squantity = squantity;
        this.sprice = sprice;
        this.stime = stime;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
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
}
