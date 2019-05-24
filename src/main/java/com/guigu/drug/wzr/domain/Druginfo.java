package com.guigu.drug.wzr.domain;

/*
* 药品信息查询
* */
public class Druginfo {
    private int drugid;
    private String drugbarcode;
    private String drugname;
    private String drugabbreviation;
    private String drugspecification;
    private String drugunit;
    private String drugproduceaddress;
    private String drugapprovalnumber;
    private String drugproductdate;
    private String drugbaozhiqi;
    private int typeid;
    private int drugstock;
    private double drugbuyingprice;
    private double drugsellingprice;

    private Styledrug s;

    public int getDrugid() {
        return drugid;
    }

    public void setDrugid(int drugid) {
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

    public Druginfo(int drugid, String drugbarcode, String drugname, String drugabbreviation, String drugspecification, String drugunit, String drugproduceaddress, String drugapprovalnumber, String drugproductdate, String drugbaozhiqi, int typeid, int drugstock, double drugbuyingprice, double drugsellingprice, Styledrug s) {
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
