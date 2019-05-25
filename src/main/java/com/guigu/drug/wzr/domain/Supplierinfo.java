package com.guigu.drug.wzr.domain;
/*
* 供应商类
* */
public class Supplierinfo {

    private int supplierid;//供应商编号
    private String suppliername;//供应商名称
    private String supplierpinyin;//供应商拼音码
    private String supplierabbreviation;//供应商简称
    private String suppliercontacts;//供应商联系人
    private String supplieraddress;//供应商地址
    private String supplieryoubian;//供应商邮编
    private String supplierphone;//供应商电话
    private String supplierfax;//供应商传真
    private String supplieropenbank;//供应商开户行
    private String suppliercardno;//供应商银行号
    private String supplierstoreroom;//供应商库房地址
    private String supplierstoreroomphone;//供应商库房电话
    private int suppliersalesman;//供应商业务员编号

    private Userinfo user;

    public Supplierinfo(int supplierid, String suppliername, String supplierpinyin, String supplierabbreviation, String suppliercontacts, String supplieraddress, String supplieryoubian, String supplierphone, String supplierfax, String supplieropenbank, String suppliercardno, String supplierstoreroom, String supplierstoreroomphone, int suppliersalesman, Userinfo user) {
        this.supplierid = supplierid;
        this.suppliername = suppliername;
        this.supplierpinyin = supplierpinyin;
        this.supplierabbreviation = supplierabbreviation;
        this.suppliercontacts = suppliercontacts;
        this.supplieraddress = supplieraddress;
        this.supplieryoubian = supplieryoubian;
        this.supplierphone = supplierphone;
        this.supplierfax = supplierfax;
        this.supplieropenbank = supplieropenbank;
        this.suppliercardno = suppliercardno;
        this.supplierstoreroom = supplierstoreroom;
        this.supplierstoreroomphone = supplierstoreroomphone;
        this.suppliersalesman = suppliersalesman;
        this.user = user;
    }

    public Supplierinfo() {
    }

    @Override
    public String toString() {
        return "Supplierinfo{" +
                "supplierid=" + supplierid +
                ", suppliername='" + suppliername + '\'' +
                ", supplierpinyin='" + supplierpinyin + '\'' +
                ", supplierabbreviation='" + supplierabbreviation + '\'' +
                ", suppliercontacts='" + suppliercontacts + '\'' +
                ", supplieraddress='" + supplieraddress + '\'' +
                ", supplieryoubian='" + supplieryoubian + '\'' +
                ", supplierphone='" + supplierphone + '\'' +
                ", supplierfax='" + supplierfax + '\'' +
                ", supplieropenbank='" + supplieropenbank + '\'' +
                ", suppliercardno='" + suppliercardno + '\'' +
                ", supplierstoreroom='" + supplierstoreroom + '\'' +
                ", supplierstoreroomphone='" + supplierstoreroomphone + '\'' +
                ", suppliersalesman=" + suppliersalesman +
                ", user=" + user +
                '}';
    }

    public int getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(int supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getSupplierpinyin() {
        return supplierpinyin;
    }

    public void setSupplierpinyin(String supplierpinyin) {
        this.supplierpinyin = supplierpinyin;
    }

    public String getSupplierabbreviation() {
        return supplierabbreviation;
    }

    public void setSupplierabbreviation(String supplierabbreviation) {
        this.supplierabbreviation = supplierabbreviation;
    }

    public String getSuppliercontacts() {
        return suppliercontacts;
    }

    public void setSuppliercontacts(String suppliercontacts) {
        this.suppliercontacts = suppliercontacts;
    }

    public String getSupplieraddress() {
        return supplieraddress;
    }

    public void setSupplieraddress(String supplieraddress) {
        this.supplieraddress = supplieraddress;
    }

    public String getSupplieryoubian() {
        return supplieryoubian;
    }

    public void setSupplieryoubian(String supplieryoubian) {
        this.supplieryoubian = supplieryoubian;
    }

    public String getSupplierphone() {
        return supplierphone;
    }

    public void setSupplierphone(String supplierphone) {
        this.supplierphone = supplierphone;
    }

    public String getSupplierfax() {
        return supplierfax;
    }

    public void setSupplierfax(String supplierfax) {
        this.supplierfax = supplierfax;
    }

    public String getSupplieropenbank() {
        return supplieropenbank;
    }

    public void setSupplieropenbank(String supplieropenbank) {
        this.supplieropenbank = supplieropenbank;
    }

    public String getSuppliercardno() {
        return suppliercardno;
    }

    public void setSuppliercardno(String suppliercardno) {
        this.suppliercardno = suppliercardno;
    }

    public String getSupplierstoreroom() {
        return supplierstoreroom;
    }

    public void setSupplierstoreroom(String supplierstoreroom) {
        this.supplierstoreroom = supplierstoreroom;
    }

    public String getSupplierstoreroomphone() {
        return supplierstoreroomphone;
    }

    public void setSupplierstoreroomphone(String supplierstoreroomphone) {
        this.supplierstoreroomphone = supplierstoreroomphone;
    }

    public int getSuppliersalesman() {
        return suppliersalesman;
    }

    public void setSuppliersalesman(int suppliersalesman) {
        this.suppliersalesman = suppliersalesman;
    }

    public Userinfo getUser() {
        return user;
    }

    public void setUser(Userinfo user) {
        this.user = user;
    }
}
