package com.guigu.drug.wzr.domain;
/*
* 持久对象：采购入库（VO）
* */
public class DrugrecordVo {

    private Drugrecord dd;//采购入库类
    private Supplierinfo s;//供应商类
    private Druginfo d;//药品类

    @Override
    public String toString() {
        return "DrugrecordVo{" +
                "dd=" + dd +
                ", s=" + s +
                ", d=" + d +
                '}';
    }

    public Drugrecord getDd() {
        return dd;
    }

    public void setDd(Drugrecord dd) {
        this.dd = dd;
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

    public DrugrecordVo() {
    }

    public DrugrecordVo(Drugrecord dd, Supplierinfo s, Druginfo d) {
        this.dd = dd;
        this.s = s;
        this.d = d;
    }
}
