package com.guigu.drug.wzr.domain;

/*
* 药品信息类
* */
public class Druginfo {
    private Integer drugid;//药品编号
    private String drugbarcode;//药品条形码
    private String drugname;//药品名称
    private String drugabbreviation;//药品简称
    private String drugspecification;//药品规格
    private String drugunit;//药品单位
    private String drugproduceaddress;//药品产地
    private String drugapprovalnumber;//药品批准文号
    private String drugproductdate;//药品生产日期
    private String drugbaozhiqi;//药品保质期
    private int typeid;//药品类别编号
    private int drugstock;//药品库存
    private double drugbuyingprice;//药品进货价
    private double drugsellingprice;//药品售货价

    private Styledrug s;//类部类：药品类型类

    public Integer getDrugid() {
        return drugid;
    }

    public void setDrugid(Integer drugid) {
        this.drugid = drugid;
    }

    public String getDrugbarcode() {
        return drugbarcode;
    }

    public void setDrugbarcode(String drugbarcode) {
        this.drugbarcode = drugbarcode;
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }

    public String getDrugabbreviation() {
        return drugabbreviation;
    }

    public void setDrugabbreviation(String drugabbreviation) {
        this.drugabbreviation = drugabbreviation;
    }

    public String getDrugspecification() {
        return drugspecification;
    }

    public void setDrugspecification(String drugspecification) {
        this.drugspecification = drugspecification;
    }

    public String getDrugunit() {
        return drugunit;
    }

    public void setDrugunit(String drugunit) {
        this.drugunit = drugunit;
    }

    public String getDrugproduceaddress() {
        return drugproduceaddress;
    }

    public void setDrugproduceaddress(String drugproduceaddress) {
        this.drugproduceaddress = drugproduceaddress;
    }

    public String getDrugapprovalnumber() {
        return drugapprovalnumber;
    }

    public void setDrugapprovalnumber(String drugapprovalnumber) {
        this.drugapprovalnumber = drugapprovalnumber;
    }

    public String getDrugproductdate() {
        return drugproductdate;
    }

    public void setDrugproductdate(String drugproductdate) {
        this.drugproductdate = drugproductdate;
    }

    public String getDrugbaozhiqi() {
        return drugbaozhiqi;
    }

    public void setDrugbaozhiqi(String drugbaozhiqi) {
        this.drugbaozhiqi = drugbaozhiqi;
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public int getDrugstock() {
        return drugstock;
    }

    public void setDrugstock(int drugstock) {
        this.drugstock = drugstock;
    }

    public double getDrugbuyingprice() {
        return drugbuyingprice;
    }

    public void setDrugbuyingprice(double drugbuyingprice) {
        this.drugbuyingprice = drugbuyingprice;
    }

    public double getDrugsellingprice() {
        return drugsellingprice;
    }

    public void setDrugsellingprice(double drugsellingprice) {
        this.drugsellingprice = drugsellingprice;
    }

    public Styledrug getS() {
        return s;
    }

    public void setS(Styledrug s) {
        this.s = s;
    }

    public Druginfo(Integer drugid, String drugbarcode, String drugname, String drugabbreviation, String drugspecification, String drugunit, String drugproduceaddress, String drugapprovalnumber, String drugproductdate, String drugbaozhiqi, int typeid, int drugstock, double drugbuyingprice, double drugsellingprice, Styledrug s) {
        this.drugid = drugid;
        this.drugbarcode = drugbarcode;
        this.drugname = drugname;
        this.drugabbreviation = drugabbreviation;
        this.drugspecification = drugspecification;
        this.drugunit = drugunit;
        this.drugproduceaddress = drugproduceaddress;
        this.drugapprovalnumber = drugapprovalnumber;
        this.drugproductdate = drugproductdate;
        this.drugbaozhiqi = drugbaozhiqi;
        this.typeid = typeid;
        this.drugstock = drugstock;
        this.drugbuyingprice = drugbuyingprice;
        this.drugsellingprice = drugsellingprice;
        this.s = s;
    }

    public Druginfo() {
    }

    @Override
    public String toString() {
        return "Druginfo{" +
                "drugid=" + drugid +
                ", drugbarcode='" + drugbarcode + '\'' +
                ", drugname='" + drugname + '\'' +
                ", drugabbreviation='" + drugabbreviation + '\'' +
                ", drugspecification='" + drugspecification + '\'' +
                ", drugunit='" + drugunit + '\'' +
                ", drugproduceaddress='" + drugproduceaddress + '\'' +
                ", drugapprovalnumber='" + drugapprovalnumber + '\'' +
                ", drugproductdate='" + drugproductdate + '\'' +
                ", drugbaozhiqi='" + drugbaozhiqi + '\'' +
                ", typeid=" + typeid +
                ", drugstock=" + drugstock +
                ", drugbuyingprice=" + drugbuyingprice +
                ", drugsellingprice=" + drugsellingprice +
                ", s=" + s +
                '}';
    }
}
