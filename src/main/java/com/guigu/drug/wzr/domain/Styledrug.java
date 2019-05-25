package com.guigu.drug.wzr.domain;

/*
* 药品类型类
* */
public class Styledrug {
    private int typeid;//药品编号
    private String typeidd;//药品编号：客户端传值
    private String typedrug;///药品类型
    private Druginfo druginfo;//药品类

    public Styledrug(int typeid, String typeidd, String typedrug, Druginfo druginfo) {
        this.typeid = typeid;
        this.typeidd = typeidd;
        this.typedrug = typedrug;
        this.druginfo = druginfo;
    }

    public Styledrug() {
    }

    @Override
    public String toString() {
        return "Styledrug{" +
                "typeid=" + typeid +
                ", typeidd='" + typeidd + '\'' +
                ", typedrug='" + typedrug + '\'' +
                ", druginfo=" + druginfo +
                '}';
    }

    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getTypeidd() {
        return typeidd;
    }

    public void setTypeidd(String typeidd) {
        this.typeidd = typeidd;
    }

    public String getTypedrug() {
        return typedrug;
    }

    public void setTypedrug(String typedrug) {
        this.typedrug = typedrug;
    }

    public Druginfo getDruginfo() {
        return druginfo;
    }

    public void setDruginfo(Druginfo druginfo) {
        this.druginfo = druginfo;
    }
}
