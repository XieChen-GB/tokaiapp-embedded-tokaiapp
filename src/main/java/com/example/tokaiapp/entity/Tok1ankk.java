package com.example.tokaiapp.entity;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tok1ankk")
public class Tok1ankk {

    @EmbeddedId
    @JsonUnwrapped
    private Tok1ankkId id;

    @Column(name = "ji_cd")
    private String ji_cd;

    @Column(name = "toku_cd")
    private String toku_cd;

    @Column(name = "tkji_cd")
    private String tkji_cd;

    @Column(name = "genba_name")
    private String genba_name;

    public Tok1ankk() {}

    public Tok1ankkId getId() { return id; }
    public void setId(Tok1ankkId id) { this.id = id; }

    public String getJi_cd() { return ji_cd; }
    public void setJi_cd(String ji_cd) { this.ji_cd = ji_cd; }

    public String getToku_cd() { return toku_cd; }
    public void setToku_cd(String toku_cd) { this.toku_cd = toku_cd; }

    public String getTkji_cd() { return tkji_cd; }
    public void setTkji_cd(String tkji_cd) { this.tkji_cd = tkji_cd; }

    public String getGenba_name() { return genba_name; }
    public void setGenba_name(String genba_name) { this.genba_name = genba_name; }
}
