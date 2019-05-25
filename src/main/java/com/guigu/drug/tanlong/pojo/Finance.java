package com.guigu.drug.tanlong.pojo;

//公司财务实体类
public class Finance {

    private int fid;//公司财务id
    private String idcard;//公司财务银行卡号
    private double blance;//公司账户总余额

    public Finance(){

    }

    public Finance(double blance) {
        this.blance = blance;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public double getBlance() {
        return blance;
    }

    public void setBlance(double blance) {
        this.blance = blance;
    }
}
