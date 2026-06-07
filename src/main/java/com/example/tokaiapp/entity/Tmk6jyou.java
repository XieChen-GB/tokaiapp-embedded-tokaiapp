package com.example.tokaiapp.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tmk6jyou")
public class Tmk6jyou {

    @Id
    @Column(name = "ji_cd")
    private String ji_cd;

    @Column(name = "ji_name")
    private String ji_name;

    @JsonIgnoreProperties("tmk6jyou")
    @OneToMany(mappedBy = "tmk6jyou")
    private List<Tok1ankk> tok1ankkList;

    public Tmk6jyou() {}

    public String getJi_cd() { return ji_cd; }
    public void setJi_cd(String ji_cd) { this.ji_cd = ji_cd; }

    public String getJi_name() { return ji_name; }
    public void setJi_name(String ji_name) { this.ji_name = ji_name; }

    public List<Tok1ankk> getTok1ankkList() { return tok1ankkList; }
    public void setTok1ankkList(List<Tok1ankk> tok1ankkList) { this.tok1ankkList = tok1ankkList; }
}
