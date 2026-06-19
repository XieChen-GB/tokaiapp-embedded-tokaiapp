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
    private String jiCd;

    @Column(name = "toku_cd")
    private String tokuCd;

    @Column(name = "tkji_cd")
    private String tkjiCd;

    @Column(name = "gen_nm")
    private String genNm;

    @Column(name = "jyu_ji_nm")
    private String jyuJiNm;

    @Column(name = "jyu_ji_rnm")
    private String jyuJiRnm;

    @Column(name = "an_l_bai_kb")
    private String anLBaiKb;

    @Column(name = "min_kan_kb")
    private String minKanKb;

    @Column(name = "jyu_ka_cd")
    private String jyuKaCd;

    @Column(name = "an_dt")
    private Integer anDt;

    @Column(name = "kj_nm")
    private String kjNm;

    @Column(name = "tato_no")
    private String tatoNo;

    @Column(name = "tkbsy_nm")
    private String tkbsyNm;

    @Column(name = "tdfk_nm")
    private String tdfkNm;

    @Column(name = "skscs_nm")
    private String skscsNm;

    public Tok1ankk() {}

    public Tok1ankkId getId() { return id; }
    public void setId(Tok1ankkId id) { this.id = id; }

    public String getJiCd() { return jiCd; }
    public void setJiCd(String jiCd) { this.jiCd = jiCd; }

    public String getTokuCd() { return tokuCd; }
    public void setTokuCd(String tokuCd) { this.tokuCd = tokuCd; }

    public String getTkjiCd() { return tkjiCd; }
    public void setTkjiCd(String tkjiCd) { this.tkjiCd = tkjiCd; }

    public String getGenNm() { return genNm; }
    public void setGenNm(String genNm) { this.genNm = genNm; }

    public String getJyuJiNm() { return jyuJiNm; }
    public void setJyuJiNm(String jyuJiNm) { this.jyuJiNm = jyuJiNm; }

    public String getJyuJiRnm() { return jyuJiRnm; }
    public void setJyuJiRnm(String jyuJiRnm) { this.jyuJiRnm = jyuJiRnm; }

    public String getAnLBaiKb() { return anLBaiKb; }
    public void setAnLBaiKb(String anLBaiKb) { this.anLBaiKb = anLBaiKb; }

    public String getMinKanKb() { return minKanKb; }
    public void setMinKanKb(String minKanKb) { this.minKanKb = minKanKb; }

    public String getJyuKaCd() { return jyuKaCd; }
    public void setJyuKaCd(String jyuKaCd) { this.jyuKaCd = jyuKaCd; }

    public Integer getAnDt() { return anDt; }
    public void setAnDt(Integer anDt) { this.anDt = anDt; }

    public String getKjNm() { return kjNm; }
    public void setKjNm(String kjNm) { this.kjNm = kjNm; }

    public String getTatoNo() { return tatoNo; }
    public void setTatoNo(String tatoNo) { this.tatoNo = tatoNo; }

    public String getTkbsyNm() { return tkbsyNm; }
    public void setTkbsyNm(String tkbsyNm) { this.tkbsyNm = tkbsyNm; }

    public String getTdfkNm() { return tdfkNm; }
    public void setTdfkNm(String tdfkNm) { this.tdfkNm = tdfkNm; }

    public String getSkscsNm() { return skscsNm; }
    public void setSkscsNm(String skscsNm) { this.skscsNm = skscsNm; }
}
