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

    @Column(name = "gen_nm")
    private String gen_nm;

    @Column(name = "jyu_ji_nm")
    private String jyu_ji_nm;

    @Column(name = "jyu_ji_rnm")
    private String jyu_ji_rnm;

    @Column(name = "an_l_bai_kb")
    private String an_l_bai_kb;

    @Column(name = "min_kan_kb")
    private String min_kan_kb;

    @Column(name = "jyu_ka_cd")
    private String jyu_ka_cd;

    @Column(name = "an_dt")
    private Integer an_dt;

    @Column(name = "kj_nm")
    private String kj_nm;

    @Column(name = "tato_no")
    private String tato_no;

    @Column(name = "tkbsy_nm")
    private String tkbsy_nm;

    @Column(name = "tdfk_nm")
    private String tdfk_nm;

    @Column(name = "skscs_nm")
    private String skscs_nm;

    public Tok1ankk() {}

    public Tok1ankkId getId() { return id; }
    public void setId(Tok1ankkId id) { this.id = id; }

    public String getJi_cd() { return ji_cd; }
    public void setJi_cd(String ji_cd) { this.ji_cd = ji_cd; }

    public String getToku_cd() { return toku_cd; }
    public void setToku_cd(String toku_cd) { this.toku_cd = toku_cd; }

    public String getTkji_cd() { return tkji_cd; }
    public void setTkji_cd(String tkji_cd) { this.tkji_cd = tkji_cd; }

    public String getGen_nm() { return gen_nm; }
    public void setGen_nm(String gen_nm) { this.gen_nm = gen_nm; }

    public String getJyu_ji_nm() { return jyu_ji_nm; }
    public void setJyu_ji_nm(String jyu_ji_nm) { this.jyu_ji_nm = jyu_ji_nm; }

    public String getJyu_ji_rnm() { return jyu_ji_rnm; }
    public void setJyu_ji_rnm(String jyu_ji_rnm) { this.jyu_ji_rnm = jyu_ji_rnm; }

    public String getAn_l_bai_kb() { return an_l_bai_kb; }
    public void setAn_l_bai_kb(String an_l_bai_kb) { this.an_l_bai_kb = an_l_bai_kb; }

    public String getMin_kan_kb() { return min_kan_kb; }
    public void setMin_kan_kb(String min_kan_kb) { this.min_kan_kb = min_kan_kb; }

    public String getJyu_ka_cd() { return jyu_ka_cd; }
    public void setJyu_ka_cd(String jyu_ka_cd) { this.jyu_ka_cd = jyu_ka_cd; }

    public Integer getAn_dt() { return an_dt; }
    public void setAn_dt(Integer an_dt) { this.an_dt = an_dt; }

    public String getKj_nm() { return kj_nm; }
    public void setKj_nm(String kj_nm) { this.kj_nm = kj_nm; }

    public String getTato_no() { return tato_no; }
    public void setTato_no(String tato_no) { this.tato_no = tato_no; }

    public String getTkbsy_nm() { return tkbsy_nm; }
    public void setTkbsy_nm(String tkbsy_nm) { this.tkbsy_nm = tkbsy_nm; }

    public String getTdfk_nm() { return tdfk_nm; }
    public void setTdfk_nm(String tdfk_nm) { this.tdfk_nm = tdfk_nm; }

    public String getSkscs_nm() { return skscs_nm; }
    public void setSkscs_nm(String skscs_nm) { this.skscs_nm = skscs_nm; }
}
