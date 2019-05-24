package com.guigu.drug.wzr.domain;

public class Supplierinfo {

    private int supplierid;
    private String suppliername;
    private String supplierpinyin;
    private String supplierabbreviation;
    private String suppliercontacts;
    private String supplieraddress;
    private String supplieryoubian;
    private String supplierphone;
    private String supplierfax;
    private String supplieropenbank;
    private String suppliercardno;
    private String supplierstoreroom;
    private String supplierstoreroomphone;
    private int suppliersalesman;

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
