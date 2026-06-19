package com.example.tokaiapp.entity;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tok1bukk")
public class Tok1bukk {

    @EmbeddedId
    @JsonUnwrapped
    private Tok1bukkId id;

    @Column(name = "bu_bun_rui")
    private String buBunRui;

    @Column(name = "bu_syu")
    private String buSyu;

    @Column(name = "bu_kb")
    private String buKb;

    @Column(name = "jt_kb")
    private String jtKb;

    @Column(name = "bu_dt")
    private Integer buDt;

    @Column(name = "bu_skkn_dt")
    private Integer buSkknDt;

    @Column(name = "bu_kikn_dt")
    private Integer buKiknDt;

    @Column(name = "tlg_cd")
    private String tlgCd;

    @Column(name = "bu_hs_kb")
    private String buHsKb;

    @Column(name = "kj_sk_jcd")
    private String kjSkJcd;

    @Column(name = "kj_skj_rnm")
    private String kjSkjRnm;

    @Column(name = "bu_ldy")
    private Integer buLdy;

    @Column(name = "bu_lki_dt")
    private Integer buLkiDt;

    @Column(name = "bu_lmn_dt")
    private Integer buLmnDt;

    @Column(name = "bu_lst")
    private String buLst;

    @Column(name = "hs_cd")
    private String hsCd;

    @Column(name = "hs_km_rn")
    private String hsKmRn;

    @Column(name = "hs_ki")
    private String hsKi;

    @Column(name = "hs_no_ki")
    private Double hsNoKi;

    @Column(name = "hs_tuma")
    private Double hsTuma;

    @Column(name = "hs_keta")
    private Double hsKeta;

    @Column(name = "hus_g_set")
    private String husGSet;

    @Column(name = "bu_nkatu")
    private String buNkatu;

    public Tok1bukk() {}

    public Tok1bukkId getId() { return id; }
    public void setId(Tok1bukkId id) { this.id = id; }

    public String getBuBunRui() { return buBunRui; }
    public void setBuBunRui(String buBunRui) { this.buBunRui = buBunRui; }

    public String getBuSyu() { return buSyu; }
    public void setBuSyu(String buSyu) { this.buSyu = buSyu; }

    public String getBuKb() { return buKb; }
    public void setBuKb(String buKb) { this.buKb = buKb; }

    public String getJtKb() { return jtKb; }
    public void setJtKb(String jtKb) { this.jtKb = jtKb; }

    public Integer getBuDt() { return buDt; }
    public void setBuDt(Integer buDt) { this.buDt = buDt; }

    public Integer getBuSkknDt() { return buSkknDt; }
    public void setBuSkknDt(Integer buSkknDt) { this.buSkknDt = buSkknDt; }

    public Integer getBuKiknDt() { return buKiknDt; }
    public void setBuKiknDt(Integer buKiknDt) { this.buKiknDt = buKiknDt; }

    public String getTlgCd() { return tlgCd; }
    public void setTlgCd(String tlgCd) { this.tlgCd = tlgCd; }

    public String getBuHsKb() { return buHsKb; }
    public void setBuHsKb(String buHsKb) { this.buHsKb = buHsKb; }

    public String getKjSkJcd() { return kjSkJcd; }
    public void setKjSkJcd(String kjSkJcd) { this.kjSkJcd = kjSkJcd; }

    public String getKjSkjRnm() { return kjSkjRnm; }
    public void setKjSkjRnm(String kjSkjRnm) { this.kjSkjRnm = kjSkjRnm; }

    public Integer getBuLdy() { return buLdy; }
    public void setBuLdy(Integer buLdy) { this.buLdy = buLdy; }

    public Integer getBuLkiDt() { return buLkiDt; }
    public void setBuLkiDt(Integer buLkiDt) { this.buLkiDt = buLkiDt; }

    public Integer getBuLmnDt() { return buLmnDt; }
    public void setBuLmnDt(Integer buLmnDt) { this.buLmnDt = buLmnDt; }

    public String getBuLst() { return buLst; }
    public void setBuLst(String buLst) { this.buLst = buLst; }

    public String getHsCd() { return hsCd; }
    public void setHsCd(String hsCd) { this.hsCd = hsCd; }

    public String getHsKmRn() { return hsKmRn; }
    public void setHsKmRn(String hsKmRn) { this.hsKmRn = hsKmRn; }

    public String getHsKi() { return hsKi; }
    public void setHsKi(String hsKi) { this.hsKi = hsKi; }

    public Double getHsNoKi() { return hsNoKi; }
    public void setHsNoKi(Double hsNoKi) { this.hsNoKi = hsNoKi; }

    public Double getHsTuma() { return hsTuma; }
    public void setHsTuma(Double hsTuma) { this.hsTuma = hsTuma; }

    public Double getHsKeta() { return hsKeta; }
    public void setHsKeta(Double hsKeta) { this.hsKeta = hsKeta; }

    public String getHusGSet() { return husGSet; }
    public void setHusGSet(String husGSet) { this.husGSet = husGSet; }

    public String getBuNkatu() { return buNkatu; }
    public void setBuNkatu(String buNkatu) { this.buNkatu = buNkatu; }
}
