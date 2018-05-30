package com.example.demo.bean;

import java.io.Serializable;
import java.util.Date;

public class BidLanguageRelation implements Serializable {
    private int id;
    private String bid;
    private String language;
    private int status;
    private Date gmtModified;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "BidLanguageRelation{" +
                "id='" + id + '\'' +
                ", bid='" + bid + '\'' +
                ", language='" + language + '\'' +
                ", status=" + status +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
