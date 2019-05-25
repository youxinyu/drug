package com.guigu.drug.tanlong.pojo;

//销售记录实体类
public class Sell {

    private int sellid;//销售记录id
    private int  drugid;//引用药品表id
    private int clientid;//引用员工表id
    private int squantitys;//销售数量
    private double sprices;//销售总价格
    private String sdate;//销售时间
    private String strusts;//状态

    private DrugInfo d;
    private ClientInfo c;

    public Sell(){

    }

    public DrugInfo getD() {
        return d;
    }

    public void setD(DrugInfo d) {
        this.d = d;
    }

    public ClientInfo getC() {
        return c;
    }

    public void setC(ClientInfo c) {
        this.c = c;
    }

    public Sell(int sellid) {
        this.sellid = sellid;
    }

    public Sell(int drugid, int clientid, int squantitys, double sprices, String sdate, String strusts) {
        this.drugid = drugid;
        this.clientid = clientid;
        this.squantitys = squantitys;
        this.sprices = sprices;
        this.sdate = sdate;
        this.strusts = strusts;
    }

    public int getSellid() {
        return sellid;
    }

    public void setSellid(int sellid) {
        this.sellid = sellid;
    }

    public int getDrugid() {
        return drugid;
    }

    public void setDrugid(int drugid) {
        this.drugid = drugid;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public int getSquantitys() {
        return squantitys;
    }

    public void setSquantitys(int squantitys) {
        this.squantitys = squantitys;
    }

    public double getSprices() {
        return sprices;
    }

    public void setSprices(double sprices) {
        this.sprices = sprices;
    }

    public String getSdate() {
        return sdate;
    }

    public void setSdate(String sdate) {
        this.sdate = sdate;
    }

    public String getStrusts() {
        return strusts;
    }

    public void setStrusts(String strusts) {
        this.strusts = strusts;
    }
}
