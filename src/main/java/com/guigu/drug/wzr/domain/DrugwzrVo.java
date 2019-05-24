package com.guigu.drug.wzr.domain;

import javax.swing.text.Style;

public class DrugwzrVo {
    private Druginfo i;
    private Styledrug s;
    private String date1;
    private String date2;

    public DrugwzrVo(Druginfo i, Styledrug s, String date1, String date2) {
        this.i = i;
        this.s = s;
        this.date1 = date1;
        this.date2 = date2;
    }

    public DrugwzrVo() {
    }

    public Druginfo getI() {
        return i;
    }

    public void setI(Druginfo i) {
        this.i = i;
    }

    public Styledrug getS() {
        return s;
    }

    public void setS(Styledrug s) {
        this.s = s;
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


    @Override
    public String toString() {
        return "DrugwzrVo{" +
                "i=" + i +
                ", s=" + s +
                ", date1='" + date1 + '\'' +
                ", date2='" + date2 + '\'' +
                '}';
    }
}
