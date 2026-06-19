package com.example.tokaiapp.entity;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tmk1tkui")
public class Tmk1tkui {

    @EmbeddedId
    @JsonUnwrapped
    private Tmk1tkuiId id;

    @Column(name = "tk_nm")
    private String tkNm;

    @Column(name = "tkji_nm")
    private String tkjiNm;

    @Column(name = "tk_nm_kn")
    private String tkNmKn;

    @Column(name = "tkji_nm_kn")
    private String tkjiNmKn;

    @Column(name = "tkyb_no")
    private String tkybNo;

    @Column(name = "tkjs1")
    private String tkjs1;

    @Column(name = "tkjs2")
    private String tkjs2;

    @Column(name = "tk_tel")
    private String tkTel;

    @Column(name = "tk_fax")
    private String tkFax;

    @Column(name = "tk_kb")
    private String tkKb;

    @Column(name = "tk_tp")
    private String tkTp;

    public Tmk1tkui() {}

    public Tmk1tkuiId getId() { return id; }
    public void setId(Tmk1tkuiId id) { this.id = id; }

    public String getTkNm() { return tkNm; }
    public void setTkNm(String tkNm) { this.tkNm = tkNm; }

    public String getTkjiNm() { return tkjiNm; }
    public void setTkjiNm(String tkjiNm) { this.tkjiNm = tkjiNm; }

    public String getTkNmKn() { return tkNmKn; }
    public void setTkNmKn(String tkNmKn) { this.tkNmKn = tkNmKn; }

    public String getTkjiNmKn() { return tkjiNmKn; }
    public void setTkjiNmKn(String tkjiNmKn) { this.tkjiNmKn = tkjiNmKn; }

    public String getTkybNo() { return tkybNo; }
    public void setTkybNo(String tkybNo) { this.tkybNo = tkybNo; }

    public String getTkjs1() { return tkjs1; }
    public void setTkjs1(String tkjs1) { this.tkjs1 = tkjs1; }

    public String getTkjs2() { return tkjs2; }
    public void setTkjs2(String tkjs2) { this.tkjs2 = tkjs2; }

    public String getTkTel() { return tkTel; }
    public void setTkTel(String tkTel) { this.tkTel = tkTel; }

    public String getTkFax() { return tkFax; }
    public void setTkFax(String tkFax) { this.tkFax = tkFax; }

    public String getTkKb() { return tkKb; }
    public void setTkKb(String tkKb) { this.tkKb = tkKb; }

    public String getTkTp() { return tkTp; }
    public void setTkTp(String tkTp) { this.tkTp = tkTp; }
}
