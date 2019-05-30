package com.guigu.drug.wzr.domain;

/*
* 采购退货VO
* */
public class SalesVo {

    private Supplierinfo s;
    private Druginfo d;
    private Sales e;
    private String date1;
    private String date2;

    @Override
    public String toString() {
        return "SalesVo{" +
                "s=" + s +
                ", d=" + d +
                ", e=" + e +
                ", date1='" + date1 + '\'' +
                ", date2='" + date2 + '\'' +
                '}';
    }

    public Supplierinfo getS() {
        return s;
    }

    public void setS(Supplierinfo s) {
        this.s = s;
    }

    public Druginfo getD() {
        return d;
    }

    public void setD(Druginfo d) {
        this.d = d;
    }

    public Sales getE() {
        return e;
    }

    public void setE(Sales e) {
        this.e = e;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public SalesVo() {
    }

    public SalesVo(Supplierinfo s, Druginfo d, Sales e, String date1, String date2) {
        this.s = s;
        this.d = d;
        this.e = e;
        this.date1 = date1;
        this.date2 = date2;
    }
}
