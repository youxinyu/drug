package com.guigu.drug.wzr.domain;

public class Styledrug {
    private int typeid;
    private String typeidd;
    private String typedrug;
    private Druginfo druginfo;

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
