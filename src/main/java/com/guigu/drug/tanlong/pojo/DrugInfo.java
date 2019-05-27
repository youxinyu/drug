package com.guigu.drug.tanlong.pojo;

import java.io.Serializable;

//药品实体类
public class DrugInfo{

    private int drugid;//药品编号
    private String drugbarcode;//药品条形码
    private String drugname;//药品名称
    private String drugabbreviation;//药品简称
    private String drugspecification;//药品规格
    private String drugunit;//药品单位
    private String drugproduceaddress;//药品产地
    private String drugapprovalnumber;//药品批准文号
    private double drugbuyingprice;//药品进货价
    private double drugsellingprice;//药品售货价
    private int drugstock;//药品库存
    private int drugbaozhiqi;//药品保质期
    private String drugproductdate;//药品生产日期


    public DrugInfo(){

    }

    public DrugInfo(int drugid) {
        this.drugid = drugid;
    }

    public DrugInfo(int drugid, int drugstock) {
        this.drugid = drugid;
        this.drugstock = drugstock;
    }

    public DrugInfo(String drugbarcode, String drugname, String drugabbreviation, String drugspecification, String drugunit, String drugproduceaddress, String drugapprovalnumber, double drugbuyingprice, double drugsellingprice, int drugstock, int drugbaozhiqi, String drugproductdate) {
        this.drugbarcode = drugbarcode;
        this.drugname = drugname;
        this.drugabbreviation = drugabbreviation;
        this.drugspecification = drugspecification;
        this.drugunit = drugunit;
        this.drugproduceaddress = drugproduceaddress;
        this.drugapprovalnumber = drugapprovalnumber;
        this.drugbuyingprice = drugbuyingprice;
        this.drugsellingprice = drugsellingprice;
        this.drugstock = drugstock;
        this.drugbaozhiqi = drugbaozhiqi;
        this.drugproductdate = drugproductdate;
    }

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

    public int getDrugstock() {
        return drugstock;
    }

    public void setDrugstock(int drugstock) {
        this.drugstock = drugstock;
    }

    public int getDrugbaozhiqi() {
        return drugbaozhiqi;
    }

    public void setDrugbaozhiqi(int drugbaozhiqi) {
        this.drugbaozhiqi = drugbaozhiqi;
    }

    public String getDrugproductdate() {
        return drugproductdate;
    }

    public void setDrugproductdate(String drugproductdate) {
        this.drugproductdate = drugproductdate;
    }
}
