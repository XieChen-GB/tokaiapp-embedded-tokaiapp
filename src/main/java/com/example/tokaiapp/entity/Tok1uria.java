package com.example.tokaiapp.entity;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tok1uria")
public class Tok1uria {

    @EmbeddedId
    @JsonUnwrapped
    private Tok1uriaId id;

    @Column(name = "bu_syu")
    private String bu_syu;

    @Column(name = "hikib_nr")
    private String hikib_nr;

    @Column(name = "koyo_hikb")
    private String koyo_hikb;

    @Column(name = "kote_kb")
    private String kote_kb;

    @Column(name = "agu_rf")
    private String agu_rf;

    @Column(name = "ngime_f")
    private String ngime_f;

    @Column(name = "hiki_dt")
    private Integer hiki_dt;

    @Column(name = "kete_dt")
    private Integer kete_dt;

    @Column(name = "sekokn_dt")
    private Integer sekokn_dt;

    @Column(name = "chkibo_dt")
    private Integer chkibo_dt;

    @Column(name = "knkibo_dt")
    private Integer knkibo_dt;

    @Column(name = "knyote_dt")
    private Integer knyote_dt;

    @Column(name = "hriu_cd")
    private String hriu_cd;

    @Column(name = "hriu_gyo")
    private String hriu_gyo;

    @Column(name = "hike_dt")
    private Integer hike_dt;

    @Column(name = "lki_dt")
    private Integer lki_dt;

    @Column(name = "slki_dt")
    private Integer slki_dt;

    @Column(name = "hkjkn_dt")
    private Integer hkjkn_dt;

    @Column(name = "hskh_lkik")
    private Integer hskh_lkik;

    @Column(name = "hski_ktni")
    private String hski_ktni;

    @Column(name = "mmout_st")
    private String mmout_st;

    @Column(name = "kyak_no")
    private String kyak_no;

    @Column(name = "hojo_bnr")
    private String hojo_bnr;

    @Column(name = "jyu_ka_cd")
    private String jyu_ka_cd;

    @Column(name = "tato_no")
    private String tato_no;

    @Column(name = "uregyo_st")
    private String uregyo_st;

    @Column(name = "seko_st")
    private String seko_st;

    @Column(name = "mondai_kst")
    private String mondai_kst;

    @Column(name = "ursiji_f")
    private String ursiji_f;

    @Column(name = "gyoken_st")
    private String gyoken_st;

    @Column(name = "koyo_ten")
    private Integer koyo_ten;

    @Column(name = "koyo_tet")
    private Integer koyo_tet;

    @Column(name = "koyote_j")
    private String koyote_j;

    @Column(name = "chyote_dt")
    private Integer chyote_dt;

    @Column(name = "urkjo_dt")
    private Integer urkjo_dt;

    @Column(name = "lmn_dt")
    private Integer lmn_dt;

    @Column(name = "ldy")
    private Integer ldy;

    @Column(name = "luk_dt")
    private Integer luk_dt;

    @Column(name = "slkidt_f")
    private String slkidt_f;

    @Column(name = "hipo_f")
    private String hipo_f;

    @Column(name = "zen_est")
    private String zen_est;

    @Column(name = "mmori_gg")
    private Long mmori_gg;

    @Column(name = "nbiki")
    private Long nbiki;

    @Column(name = "szei_g")
    private Long szei_g;

    @Column(name = "uriszei_r")
    private Double uriszei_r;

    @Column(name = "ur_ygen")
    private Long ur_ygen;

    @Column(name = "ygen_tat")
    private Long ygen_tat;

    @Column(name = "ygen_kai")
    private Long ygen_kai;

    @Column(name = "ygen_hyo")
    private Long ygen_hyo;

    @Column(name = "ygen_kou")
    private Long ygen_kou;

    @Column(name = "siwake_no")
    private String siwake_no;

    @Column(name = "meikno_max")
    private Integer meikno_max;

    @Column(name = "tanzei_r")
    private Double tanzei_r;

    @Column(name = "tanzei_flg")
    private String tanzei_flg;

    @Column(name = "zei_kb")
    private String zei_kb;

    public Tok1uria() {}

    public Tok1uriaId getId() { return id; }
    public void setId(Tok1uriaId id) { this.id = id; }

    public String getBu_syu() { return bu_syu; }
    public void setBu_syu(String bu_syu) { this.bu_syu = bu_syu; }

    public String getHikib_nr() { return hikib_nr; }
    public void setHikib_nr(String hikib_nr) { this.hikib_nr = hikib_nr; }

    public String getKoyo_hikb() { return koyo_hikb; }
    public void setKoyo_hikb(String koyo_hikb) { this.koyo_hikb = koyo_hikb; }

    public String getKote_kb() { return kote_kb; }
    public void setKote_kb(String kote_kb) { this.kote_kb = kote_kb; }

    public String getAgu_rf() { return agu_rf; }
    public void setAgu_rf(String agu_rf) { this.agu_rf = agu_rf; }

    public String getNgime_f() { return ngime_f; }
    public void setNgime_f(String ngime_f) { this.ngime_f = ngime_f; }

    public Integer getHiki_dt() { return hiki_dt; }
    public void setHiki_dt(Integer hiki_dt) { this.hiki_dt = hiki_dt; }

    public Integer getKete_dt() { return kete_dt; }
    public void setKete_dt(Integer kete_dt) { this.kete_dt = kete_dt; }

    public Integer getSekokn_dt() { return sekokn_dt; }
    public void setSekokn_dt(Integer sekokn_dt) { this.sekokn_dt = sekokn_dt; }

    public Integer getChkibo_dt() { return chkibo_dt; }
    public void setChkibo_dt(Integer chkibo_dt) { this.chkibo_dt = chkibo_dt; }

    public Integer getKnkibo_dt() { return knkibo_dt; }
    public void setKnkibo_dt(Integer knkibo_dt) { this.knkibo_dt = knkibo_dt; }

    public Integer getKnyote_dt() { return knyote_dt; }
    public void setKnyote_dt(Integer knyote_dt) { this.knyote_dt = knyote_dt; }

    public String getHriu_cd() { return hriu_cd; }
    public void setHriu_cd(String hriu_cd) { this.hriu_cd = hriu_cd; }

    public String getHriu_gyo() { return hriu_gyo; }
    public void setHriu_gyo(String hriu_gyo) { this.hriu_gyo = hriu_gyo; }

    public Integer getHike_dt() { return hike_dt; }
    public void setHike_dt(Integer hike_dt) { this.hike_dt = hike_dt; }

    public Integer getLki_dt() { return lki_dt; }
    public void setLki_dt(Integer lki_dt) { this.lki_dt = lki_dt; }

    public Integer getSlki_dt() { return slki_dt; }
    public void setSlki_dt(Integer slki_dt) { this.slki_dt = slki_dt; }

    public Integer getHkjkn_dt() { return hkjkn_dt; }
    public void setHkjkn_dt(Integer hkjkn_dt) { this.hkjkn_dt = hkjkn_dt; }

    public Integer getHskh_lkik() { return hskh_lkik; }
    public void setHskh_lkik(Integer hskh_lkik) { this.hskh_lkik = hskh_lkik; }

    public String getHski_ktni() { return hski_ktni; }
    public void setHski_ktni(String hski_ktni) { this.hski_ktni = hski_ktni; }

    public String getMmout_st() { return mmout_st; }
    public void setMmout_st(String mmout_st) { this.mmout_st = mmout_st; }

    public String getKyak_no() { return kyak_no; }
    public void setKyak_no(String kyak_no) { this.kyak_no = kyak_no; }

    public String getHojo_bnr() { return hojo_bnr; }
    public void setHojo_bnr(String hojo_bnr) { this.hojo_bnr = hojo_bnr; }

    public String getJyu_ka_cd() { return jyu_ka_cd; }
    public void setJyu_ka_cd(String jyu_ka_cd) { this.jyu_ka_cd = jyu_ka_cd; }

    public String getTato_no() { return tato_no; }
    public void setTato_no(String tato_no) { this.tato_no = tato_no; }

    public String getUregyo_st() { return uregyo_st; }
    public void setUregyo_st(String uregyo_st) { this.uregyo_st = uregyo_st; }

    public String getSeko_st() { return seko_st; }
    public void setSeko_st(String seko_st) { this.seko_st = seko_st; }

    public String getMondai_kst() { return mondai_kst; }
    public void setMondai_kst(String mondai_kst) { this.mondai_kst = mondai_kst; }

    public String getUrsiji_f() { return ursiji_f; }
    public void setUrsiji_f(String ursiji_f) { this.ursiji_f = ursiji_f; }

    public String getGyoken_st() { return gyoken_st; }
    public void setGyoken_st(String gyoken_st) { this.gyoken_st = gyoken_st; }

    public Integer getKoyo_ten() { return koyo_ten; }
    public void setKoyo_ten(Integer koyo_ten) { this.koyo_ten = koyo_ten; }

    public Integer getKoyo_tet() { return koyo_tet; }
    public void setKoyo_tet(Integer koyo_tet) { this.koyo_tet = koyo_tet; }

    public String getKoyote_j() { return koyote_j; }
    public void setKoyote_j(String koyote_j) { this.koyote_j = koyote_j; }

    public Integer getChyote_dt() { return chyote_dt; }
    public void setChyote_dt(Integer chyote_dt) { this.chyote_dt = chyote_dt; }

    public Integer getUrkjo_dt() { return urkjo_dt; }
    public void setUrkjo_dt(Integer urkjo_dt) { this.urkjo_dt = urkjo_dt; }

    public Integer getLmn_dt() { return lmn_dt; }
    public void setLmn_dt(Integer lmn_dt) { this.lmn_dt = lmn_dt; }

    public Integer getLdy() { return ldy; }
    public void setLdy(Integer ldy) { this.ldy = ldy; }

    public Integer getLuk_dt() { return luk_dt; }
    public void setLuk_dt(Integer luk_dt) { this.luk_dt = luk_dt; }

    public String getSlkidt_f() { return slkidt_f; }
    public void setSlkidt_f(String slkidt_f) { this.slkidt_f = slkidt_f; }

    public String getHipo_f() { return hipo_f; }
    public void setHipo_f(String hipo_f) { this.hipo_f = hipo_f; }

    public String getZen_est() { return zen_est; }
    public void setZen_est(String zen_est) { this.zen_est = zen_est; }

    public Long getMmori_gg() { return mmori_gg; }
    public void setMmori_gg(Long mmori_gg) { this.mmori_gg = mmori_gg; }

    public Long getNbiki() { return nbiki; }
    public void setNbiki(Long nbiki) { this.nbiki = nbiki; }

    public Long getSzei_g() { return szei_g; }
    public void setSzei_g(Long szei_g) { this.szei_g = szei_g; }

    public Double getUriszei_r() { return uriszei_r; }
    public void setUriszei_r(Double uriszei_r) { this.uriszei_r = uriszei_r; }

    public Long getUr_ygen() { return ur_ygen; }
    public void setUr_ygen(Long ur_ygen) { this.ur_ygen = ur_ygen; }

    public Long getYgen_tat() { return ygen_tat; }
    public void setYgen_tat(Long ygen_tat) { this.ygen_tat = ygen_tat; }

    public Long getYgen_kai() { return ygen_kai; }
    public void setYgen_kai(Long ygen_kai) { this.ygen_kai = ygen_kai; }

    public Long getYgen_hyo() { return ygen_hyo; }
    public void setYgen_hyo(Long ygen_hyo) { this.ygen_hyo = ygen_hyo; }

    public Long getYgen_kou() { return ygen_kou; }
    public void setYgen_kou(Long ygen_kou) { this.ygen_kou = ygen_kou; }

    public String getSiwake_no() { return siwake_no; }
    public void setSiwake_no(String siwake_no) { this.siwake_no = siwake_no; }

    public Integer getMeikno_max() { return meikno_max; }
    public void setMeikno_max(Integer meikno_max) { this.meikno_max = meikno_max; }

    public Double getTanzei_r() { return tanzei_r; }
    public void setTanzei_r(Double tanzei_r) { this.tanzei_r = tanzei_r; }

    public String getTanzei_flg() { return tanzei_flg; }
    public void setTanzei_flg(String tanzei_flg) { this.tanzei_flg = tanzei_flg; }

    public String getZei_kb() { return zei_kb; }
    public void setZei_kb(String zei_kb) { this.zei_kb = zei_kb; }
}
