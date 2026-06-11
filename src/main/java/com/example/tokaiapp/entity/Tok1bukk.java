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
    private String bu_bun_rui;

    @Column(name = "bu_syu")
    private String bu_syu;

    @Column(name = "bu_kb")
    private String bu_kb;

    @Column(name = "jt_kb")
    private String jt_kb;

    @Column(name = "bu_dt")
    private Integer bu_dt;

    @Column(name = "bu_skkn_dt")
    private Integer bu_skkn_dt;

    @Column(name = "bu_kikn_dt")
    private Integer bu_kikn_dt;

    @Column(name = "tlg_cd")
    private String tlg_cd;

    @Column(name = "bu_hs_kb")
    private String bu_hs_kb;

    @Column(name = "kj_sk_jcd")
    private String kj_sk_jcd;

    @Column(name = "kj_skj_rnm")
    private String kj_skj_rnm;

    @Column(name = "bu_ldy")
    private Integer bu_ldy;

    @Column(name = "bu_lki_dt")
    private Integer bu_lki_dt;

    @Column(name = "bu_lmn_dt")
    private Integer bu_lmn_dt;

    @Column(name = "bu_lst")
    private String bu_lst;

    @Column(name = "hs_cd")
    private String hs_cd;

    @Column(name = "hs_km_rn")
    private String hs_km_rn;

    @Column(name = "hs_ki")
    private String hs_ki;

    @Column(name = "hs_no_ki")
    private Double hs_no_ki;

    @Column(name = "hs_tuma")
    private Double hs_tuma;

    @Column(name = "hs_keta")
    private Double hs_keta;

    @Column(name = "hus_g_set")
    private String hus_g_set;

    @Column(name = "bu_nkatu")
    private String bu_nkatu;

    public Tok1bukk() {}

    public Tok1bukkId getId() { return id; }
    public void setId(Tok1bukkId id) { this.id = id; }

    public String getBu_bun_rui() { return bu_bun_rui; }
    public void setBu_bun_rui(String bu_bun_rui) { this.bu_bun_rui = bu_bun_rui; }

    public String getBu_syu() { return bu_syu; }
    public void setBu_syu(String bu_syu) { this.bu_syu = bu_syu; }

    public String getBu_kb() { return bu_kb; }
    public void setBu_kb(String bu_kb) { this.bu_kb = bu_kb; }

    public String getJt_kb() { return jt_kb; }
    public void setJt_kb(String jt_kb) { this.jt_kb = jt_kb; }

    public Integer getBu_dt() { return bu_dt; }
    public void setBu_dt(Integer bu_dt) { this.bu_dt = bu_dt; }

    public Integer getBu_skkn_dt() { return bu_skkn_dt; }
    public void setBu_skkn_dt(Integer bu_skkn_dt) { this.bu_skkn_dt = bu_skkn_dt; }

    public Integer getBu_kikn_dt() { return bu_kikn_dt; }
    public void setBu_kikn_dt(Integer bu_kikn_dt) { this.bu_kikn_dt = bu_kikn_dt; }

    public String getTlg_cd() { return tlg_cd; }
    public void setTlg_cd(String tlg_cd) { this.tlg_cd = tlg_cd; }

    public String getBu_hs_kb() { return bu_hs_kb; }
    public void setBu_hs_kb(String bu_hs_kb) { this.bu_hs_kb = bu_hs_kb; }

    public String getKj_sk_jcd() { return kj_sk_jcd; }
    public void setKj_sk_jcd(String kj_sk_jcd) { this.kj_sk_jcd = kj_sk_jcd; }

    public String getKj_skj_rnm() { return kj_skj_rnm; }
    public void setKj_skj_rnm(String kj_skj_rnm) { this.kj_skj_rnm = kj_skj_rnm; }

    public Integer getBu_ldy() { return bu_ldy; }
    public void setBu_ldy(Integer bu_ldy) { this.bu_ldy = bu_ldy; }

    public Integer getBu_lki_dt() { return bu_lki_dt; }
    public void setBu_lki_dt(Integer bu_lki_dt) { this.bu_lki_dt = bu_lki_dt; }

    public Integer getBu_lmn_dt() { return bu_lmn_dt; }
    public void setBu_lmn_dt(Integer bu_lmn_dt) { this.bu_lmn_dt = bu_lmn_dt; }

    public String getBu_lst() { return bu_lst; }
    public void setBu_lst(String bu_lst) { this.bu_lst = bu_lst; }

    public String getHs_cd() { return hs_cd; }
    public void setHs_cd(String hs_cd) { this.hs_cd = hs_cd; }

    public String getHs_km_rn() { return hs_km_rn; }
    public void setHs_km_rn(String hs_km_rn) { this.hs_km_rn = hs_km_rn; }

    public String getHs_ki() { return hs_ki; }
    public void setHs_ki(String hs_ki) { this.hs_ki = hs_ki; }

    public Double getHs_no_ki() { return hs_no_ki; }
    public void setHs_no_ki(Double hs_no_ki) { this.hs_no_ki = hs_no_ki; }

    public Double getHs_tuma() { return hs_tuma; }
    public void setHs_tuma(Double hs_tuma) { this.hs_tuma = hs_tuma; }

    public Double getHs_keta() { return hs_keta; }
    public void setHs_keta(Double hs_keta) { this.hs_keta = hs_keta; }

    public String getHus_g_set() { return hus_g_set; }
    public void setHus_g_set(String hus_g_set) { this.hus_g_set = hus_g_set; }

    public String getBu_nkatu() { return bu_nkatu; }
    public void setBu_nkatu(String bu_nkatu) { this.bu_nkatu = bu_nkatu; }
}
