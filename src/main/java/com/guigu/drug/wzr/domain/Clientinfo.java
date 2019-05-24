package com.guigu.drug.wzr.domain;

public class Clientinfo {

    private int clientid;
    private String clientname;
    private String clientpinyin;
    private String clientabbreviation;
    private String clientcontacts;
    private String clientaddress;
    private String clientyoubian;
    private String clientphone;
    private String clientfax;
    private String clientopenbank;
    private String clientcardno;
    private String clientsalesman;

    private Userinfo user;

    public Clientinfo(int clientid, String clientname, String clientpinyin, String clientabbreviation, String clientcontacts, String clientaddress, String clientyoubian, String clientphone, String clientfax, String clientopenbank, String clientcardno, String clientsalesman, Userinfo user) {
        this.clientid = clientid;
        this.clientname = clientname;
        this.clientpinyin = clientpinyin;
        this.clientabbreviation = clientabbreviation;
        this.clientcontacts = clientcontacts;
        this.clientaddress = clientaddress;
        this.clientyoubian = clientyoubian;
        this.clientphone = clientphone;
        this.clientfax = clientfax;
        this.clientopenbank = clientopenbank;
        this.clientcardno = clientcardno;
        this.clientsalesman = clientsalesman;
        this.user = user;
    }

    public Clientinfo() {
    }

    @Override
    public String toString() {
        return "Clientinfo{" +
                "clientid=" + clientid +
                ", clientname='" + clientname + '\'' +
                ", clientpinyin='" + clientpinyin + '\'' +
                ", clientabbreviation='" + clientabbreviation + '\'' +
                ", clientcontacts='" + clientcontacts + '\'' +
                ", clientaddress='" + clientaddress + '\'' +
                ", clientyoubian='" + clientyoubian + '\'' +
                ", clientphone='" + clientphone + '\'' +
                ", clientfax='" + clientfax + '\'' +
                ", clientopenbank='" + clientopenbank + '\'' +
                ", clientcardno='" + clientcardno + '\'' +
                ", clientsalesman='" + clientsalesman + '\'' +
                ", user=" + user +
                '}';
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getClientpinyin() {
        return clientpinyin;
    }

    public void setClientpinyin(String clientpinyin) {
        this.clientpinyin = clientpinyin;
    }

    public String getClientabbreviation() {
        return clientabbreviation;
    }

    public void setClientabbreviation(String clientabbreviation) {
        this.clientabbreviation = clientabbreviation;
    }

    public String getClientcontacts() {
        return clientcontacts;
    }

    public void setClientcontacts(String clientcontacts) {
        this.clientcontacts = clientcontacts;
    }

    public String getClientaddress() {
        return clientaddress;
    }

    public void setClientaddress(String clientaddress) {
        this.clientaddress = clientaddress;
    }

    public String getClientyoubian() {
        return clientyoubian;
    }

    public void setClientyoubian(String clientyoubian) {
        this.clientyoubian = clientyoubian;
    }

    public String getClientphone() {
        return clientphone;
    }

    public void setClientphone(String clientphone) {
        this.clientphone = clientphone;
    }

    public String getClientfax() {
        return clientfax;
    }

    public void setClientfax(String clientfax) {
        this.clientfax = clientfax;
    }

    public String getClientopenbank() {
        return clientopenbank;
    }

    public void setClientopenbank(String clientopenbank) {
        this.clientopenbank = clientopenbank;
    }

    public String getClientcardno() {
        return clientcardno;
    }

    public void setClientcardno(String clientcardno) {
        this.clientcardno = clientcardno;
    }

    public String getClientsalesman() {
        return clientsalesman;
    }

    public void setClientsalesman(String clientsalesman) {
        this.clientsalesman = clientsalesman;
    }

    public Userinfo getUser() {
        return user;
    }

    public void setUser(Userinfo user) {
        this.user = user;
    }
}
