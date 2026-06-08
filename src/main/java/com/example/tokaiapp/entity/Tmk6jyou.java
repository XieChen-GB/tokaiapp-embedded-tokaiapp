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
    private String ji_cd;

    @Column(name = "ji_name")
    private String ji_name;

    public Tmk6jyou() {}

    public String getJi_cd() { return ji_cd; }
    public void setJi_cd(String ji_cd) { this.ji_cd = ji_cd; }

    public String getJi_name() { return ji_name; }
    public void setJi_name(String ji_name) { this.ji_name = ji_name; }
}
