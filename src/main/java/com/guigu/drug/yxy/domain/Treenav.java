package com.guigu.drug.yxy.domain;

public class Treenav {
    private int id;
    private String text;
    private String state;
    private String icon_img;
    private String url;
    private int nid;

    public Treenav() {
    }

    public Treenav(int id, String text, String state, String icon_img, String url, int nid) {
        this.id = id;
        this.text = text;
        this.state = state;
        this.icon_img = icon_img;
        this.url = url;
        this.nid = nid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getIcon_img() {
        return icon_img;
    }

    public void setIcon_img(String icon_img) {
        this.icon_img = icon_img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    @Override
    public String toString() {
        return "Treenav{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", state='" + state + '\'' +
                ", icon_img='" + icon_img + '\'' +
                ", url='" + url + '\'' +
                ", nid=" + nid +
                '}';
    }
}
