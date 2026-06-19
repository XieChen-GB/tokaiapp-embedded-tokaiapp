package com.example.tokaiapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tmk6jyou")
public class Tmk6jyou {

    @Id
    @Column(name = "ji_cd")
    private String jiCd;

    @Column(name = "ji_name")
    private String jiName;

    public Tmk6jyou() {}

    public String getJiCd() { return jiCd; }
    public void setJiCd(String jiCd) { this.jiCd = jiCd; }

    public String getJiName() { return jiName; }
    public void setJiName(String jiName) { this.jiName = jiName; }
}
