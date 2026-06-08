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
    private String tk_nm;

    @Column(name = "tkji_nm")
    private String tkji_nm;

    @Column(name = "tk_nm_kn")
    private String tk_nm_kn;

    @Column(name = "tkji_nm_kn")
    private String tkji_nm_kn;

    @Column(name = "tkyb_no")
    private String tkyb_no;

    @Column(name = "tkjs1")
    private String tkjs1;

    @Column(name = "tkjs2")
    private String tkjs2;

    @Column(name = "tk_tel")
    private String tk_tel;

    @Column(name = "tk_fax")
    private String tk_fax;

    @Column(name = "tk_kb")
    private String tk_kb;

    @Column(name = "tk_tp")
    private String tk_tp;

    public Tmk1tkui() {}

    public Tmk1tkuiId getId() { return id; }
    public void setId(Tmk1tkuiId id) { this.id = id; }

    public String getTk_nm() { return tk_nm; }
    public void setTk_nm(String tk_nm) { this.tk_nm = tk_nm; }

    public String getTkji_nm() { return tkji_nm; }
    public void setTkji_nm(String tkji_nm) { this.tkji_nm = tkji_nm; }

    public String getTk_nm_kn() { return tk_nm_kn; }
    public void setTk_nm_kn(String tk_nm_kn) { this.tk_nm_kn = tk_nm_kn; }

    public String getTkji_nm_kn() { return tkji_nm_kn; }
    public void setTkji_nm_kn(String tkji_nm_kn) { this.tkji_nm_kn = tkji_nm_kn; }

    public String getTkyb_no() { return tkyb_no; }
    public void setTkyb_no(String tkyb_no) { this.tkyb_no = tkyb_no; }

    public String getTkjs1() { return tkjs1; }
    public void setTkjs1(String tkjs1) { this.tkjs1 = tkjs1; }

    public String getTkjs2() { return tkjs2; }
    public void setTkjs2(String tkjs2) { this.tkjs2 = tkjs2; }

    public String getTk_tel() { return tk_tel; }
    public void setTk_tel(String tk_tel) { this.tk_tel = tk_tel; }

    public String getTk_fax() { return tk_fax; }
    public void setTk_fax(String tk_fax) { this.tk_fax = tk_fax; }

    public String getTk_kb() { return tk_kb; }
    public void setTk_kb(String tk_kb) { this.tk_kb = tk_kb; }

    public String getTk_tp() { return tk_tp; }
    public void setTk_tp(String tk_tp) { this.tk_tp = tk_tp; }
}
