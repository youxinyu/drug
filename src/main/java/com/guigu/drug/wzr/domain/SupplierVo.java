package com.guigu.drug.wzr.domain;
/*
* 供应商持久对象（VO）
* */
public class SupplierVo {

    private Userinfo u;//用户类
    private Supplierinfo s;//供应商类

    public SupplierVo(Userinfo u, Supplierinfo s) {
        this.u = u;
        this.s = s;
    }

    @Override
    public String toString() {
        return "SupplierVo{" +
                "u=" + u +
                ", s=" + s +
                '}';
    }

    public SupplierVo(Supplierinfo s) {
        this.s = s;
    }

    public SupplierVo() {
    }

    public Userinfo getU() {
        return u;
    }

    public void setU(Userinfo u) {
        this.u = u;
    }

    public Supplierinfo getS() {
        return s;
    }

    public void setS(Supplierinfo s) {
        this.s = s;
    }
}
