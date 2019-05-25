package com.guigu.drug.tanlong.pojo;

//药品采购信息实体类
public class Drugrecord {

   private Integer rdid;//采购信息id 自增
   private int drugid;//引用药品 表 id
   private int  supplierid;//引用供应商表id
   private int userid;//引用登录表id
   private int  rquantity;//采购数量
   private double rprice;//总价格
   private String rdate;//当前时间
   private String rstatus;//状态

   private DrugInfo i;
   private SupplierInfo f;

   public Drugrecord(){

   }

    public Drugrecord(int rdid) {
        this.rdid = rdid;
    }

    @Override
    public String toString() {
        return "Drugrecord{" +
                "rdid=" + rdid +
                ", drugid=" + drugid +
                ", supplierid=" + supplierid +
                ", userid=" + userid +
                ", rquantity=" + rquantity +
                ", rprice=" + rprice +
                ", rdate='" + rdate + '\'' +
                ", rstatus='" + rstatus + '\'' +
                ", i=" + i +
                ", f=" + f +
                '}';
    }

    public DrugInfo getI() {
        return i;
    }

    public void setI(DrugInfo i) {
        this.i = i;
    }

    public SupplierInfo getF() {
        return f;
    }

    public void setF(SupplierInfo f) {
        this.f = f;
    }

    public Drugrecord(int drugid, int supplierid, int userid, int rquantity, double rprice, String rdate, String rstatus) {
        this.drugid = drugid;
        this.supplierid = supplierid;
        this.userid = userid;
        this.rquantity = rquantity;
        this.rprice = rprice;
        this.rdate = rdate;
        this.rstatus = rstatus;
    }

    public String getRstatus() {
        return rstatus;
    }

    public void setRstatus(String rstatus) {
        this.rstatus = rstatus;
    }

    public int getRdid() {
        return rdid;
    }

    public void setRdid(int rdid) {
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

    public double getRprice() {
        return rprice;
    }

    public void setRprice(double rprice) {
        this.rprice = rprice;
    }

    public String getRdate() {
        return rdate;
    }

    public void setRdate(String rdate) {
        this.rdate = rdate;
    }
}
