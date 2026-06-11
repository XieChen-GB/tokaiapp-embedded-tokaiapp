package com.example.tokaiapp.entity;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tok1meis")
public class Tok1meis {

    @EmbeddedId
    @JsonUnwrapped
    private Tok1meisId id;

    @Column(name = "bu_syu")
    private String bu_syu;

    @Column(name = "kom_cd")
    private String kom_cd;

    @Column(name = "kom_nm")
    private String kom_nm;

    @Column(name = "tni_cd")
    private String tni_cd;

    @Column(name = "koyo_f")
    private String koyo_f;

    @Column(name = "mmorig_cd")
    private String mmorig_cd;

    @Column(name = "mmorig_nm")
    private String mmorig_nm;

    @Column(name = "ki_su")
    private String ki_su;

    @Column(name = "bkase_f")
    private String bkase_f;

    @Column(name = "kazei_f")
    private String kazei_f;

    @Column(name = "uhkam_cd")
    private String uhkam_cd;

    @Column(name = "kkanz_cd")
    private String kkanz_cd;

    @Column(name = "ghkam_cd")
    private String ghkam_cd;

    @Column(name = "thk_f")
    private String thk_f;

    @Column(name = "sesaur_f")
    private String sesaur_f;

    @Column(name = "ygenss_kb")
    private String ygenss_kb;

    @Column(name = "gkand1_dt")
    private Integer gkand1_dt;

    @Column(name = "gkend1_dt")
    private Integer gkend1_dt;

    @Column(name = "gnou_no_1")
    private String gnou_no_1;

    @Column(name = "gkand2_dt")
    private Integer gkand2_dt;

    @Column(name = "gkend2_dt")
    private Integer gkend2_dt;

    @Column(name = "gnou_no_2")
    private String gnou_no_2;

    @Column(name = "gkand3_dt")
    private Integer gkand3_dt;

    @Column(name = "gkend3_dt")
    private Integer gkend3_dt;

    @Column(name = "gnou_no_3")
    private String gnou_no_3;

    @Column(name = "genur_no")
    private String genur_no;

    @Column(name = "genkom_no")
    private String genkom_no;

    @Column(name = "su4v2_kt")
    private Double su4v2_kt;

    @Column(name = "tan")
    private Long tan;

    @Column(name = "kitss")
    private Long kitss;

    @Column(name = "nose_f")
    private String nose_f;

    @Column(name = "nose")
    private Long nose;

    @Column(name = "hasu")
    private Long hasu;

    @Column(name = "mmori")
    private Long mmori;

    @Column(name = "saisya")
    private Double saisya;

    @Column(name = "yg_tat")
    private Long yg_tat;

    @Column(name = "ygr_tat")
    private Double ygr_tat;

    @Column(name = "yg_tatz")
    private Long yg_tatz;

    @Column(name = "yg_tatzr")
    private Double yg_tatzr;

    @Column(name = "yg_kai")
    private Long yg_kai;

    @Column(name = "ygr_kai")
    private Double ygr_kai;

    @Column(name = "yg_kaic")
    private Long yg_kaic;

    @Column(name = "yg_kaicr")
    private Double yg_kaicr;

    @Column(name = "lki_ktni")
    private String lki_ktni;

    @Column(name = "khlkik")
    private Integer khlkik;

    @Column(name = "gte_haisu")
    private Integer gte_haisu;

    @Column(name = "gngime_st")
    private String gngime_st;

    @Column(name = "haj_cd1")
    private String haj_cd1;

    @Column(name = "gyo_cd1")
    private String gyo_cd1;

    @Column(name = "gken_cd1")
    private String gken_cd1;

    @Column(name = "gchyot_dt1")
    private Integer gchyot_dt1;

    @Column(name = "gngime_f1")
    private String gngime_f1;

    @Column(name = "gkenh_cd1")
    private String gkenh_cd1;

    @Column(name = "betk_cd1")
    private String betk_cd1;

    @Column(name = "tatyot_g1")
    private Long tatyot_g1;

    @Column(name = "kaiyot_g1")
    private Long kaiyot_g1;

    @Column(name = "haj_cd2")
    private String haj_cd2;

    @Column(name = "gyo_cd2")
    private String gyo_cd2;

    @Column(name = "gken_cd2")
    private String gken_cd2;

    @Column(name = "gchyot_dt2")
    private Integer gchyot_dt2;

    @Column(name = "gngime_f2")
    private String gngime_f2;

    @Column(name = "gkenh_cd2")
    private String gkenh_cd2;

    @Column(name = "betk_cd2")
    private String betk_cd2;

    @Column(name = "tatyot_g2")
    private Long tatyot_g2;

    @Column(name = "kaiyot_g2")
    private Long kaiyot_g2;

    @Column(name = "haj_cd3")
    private String haj_cd3;

    @Column(name = "gyo_cd3")
    private String gyo_cd3;

    @Column(name = "gken_cd3")
    private String gken_cd3;

    @Column(name = "gchyot_dt3")
    private Integer gchyot_dt3;

    @Column(name = "gngime_f3")
    private String gngime_f3;

    @Column(name = "gkenh_cd3")
    private String gkenh_cd3;

    @Column(name = "betk_cd3")
    private String betk_cd3;

    @Column(name = "tatyot_g3")
    private Long tatyot_g3;

    @Column(name = "kaiyot_g3")
    private Long kaiyot_g3;

    @Column(name = "sekizai_f")
    private String sekizai_f;

    public Tok1meis() {}

    public Tok1meisId getId() { return id; }
    public void setId(Tok1meisId id) { this.id = id; }

    public String getBu_syu() { return bu_syu; }
    public void setBu_syu(String bu_syu) { this.bu_syu = bu_syu; }

    public String getKom_cd() { return kom_cd; }
    public void setKom_cd(String kom_cd) { this.kom_cd = kom_cd; }

    public String getKom_nm() { return kom_nm; }
    public void setKom_nm(String kom_nm) { this.kom_nm = kom_nm; }

    public String getTni_cd() { return tni_cd; }
    public void setTni_cd(String tni_cd) { this.tni_cd = tni_cd; }

    public String getKoyo_f() { return koyo_f; }
    public void setKoyo_f(String koyo_f) { this.koyo_f = koyo_f; }

    public String getMmorig_cd() { return mmorig_cd; }
    public void setMmorig_cd(String mmorig_cd) { this.mmorig_cd = mmorig_cd; }

    public String getMmorig_nm() { return mmorig_nm; }
    public void setMmorig_nm(String mmorig_nm) { this.mmorig_nm = mmorig_nm; }

    public String getKi_su() { return ki_su; }
    public void setKi_su(String ki_su) { this.ki_su = ki_su; }

    public String getBkase_f() { return bkase_f; }
    public void setBkase_f(String bkase_f) { this.bkase_f = bkase_f; }

    public String getKazei_f() { return kazei_f; }
    public void setKazei_f(String kazei_f) { this.kazei_f = kazei_f; }

    public String getUhkam_cd() { return uhkam_cd; }
    public void setUhkam_cd(String uhkam_cd) { this.uhkam_cd = uhkam_cd; }

    public String getKkanz_cd() { return kkanz_cd; }
    public void setKkanz_cd(String kkanz_cd) { this.kkanz_cd = kkanz_cd; }

    public String getGhkam_cd() { return ghkam_cd; }
    public void setGhkam_cd(String ghkam_cd) { this.ghkam_cd = ghkam_cd; }

    public String getThk_f() { return thk_f; }
    public void setThk_f(String thk_f) { this.thk_f = thk_f; }

    public String getSesaur_f() { return sesaur_f; }
    public void setSesaur_f(String sesaur_f) { this.sesaur_f = sesaur_f; }

    public String getYgenss_kb() { return ygenss_kb; }
    public void setYgenss_kb(String ygenss_kb) { this.ygenss_kb = ygenss_kb; }

    public Integer getGkand1_dt() { return gkand1_dt; }
    public void setGkand1_dt(Integer gkand1_dt) { this.gkand1_dt = gkand1_dt; }

    public Integer getGkend1_dt() { return gkend1_dt; }
    public void setGkend1_dt(Integer gkend1_dt) { this.gkend1_dt = gkend1_dt; }

    public String getGnou_no_1() { return gnou_no_1; }
    public void setGnou_no_1(String gnou_no_1) { this.gnou_no_1 = gnou_no_1; }

    public Integer getGkand2_dt() { return gkand2_dt; }
    public void setGkand2_dt(Integer gkand2_dt) { this.gkand2_dt = gkand2_dt; }

    public Integer getGkend2_dt() { return gkend2_dt; }
    public void setGkend2_dt(Integer gkend2_dt) { this.gkend2_dt = gkend2_dt; }

    public String getGnou_no_2() { return gnou_no_2; }
    public void setGnou_no_2(String gnou_no_2) { this.gnou_no_2 = gnou_no_2; }

    public Integer getGkand3_dt() { return gkand3_dt; }
    public void setGkand3_dt(Integer gkand3_dt) { this.gkand3_dt = gkand3_dt; }

    public Integer getGkend3_dt() { return gkend3_dt; }
    public void setGkend3_dt(Integer gkend3_dt) { this.gkend3_dt = gkend3_dt; }

    public String getGnou_no_3() { return gnou_no_3; }
    public void setGnou_no_3(String gnou_no_3) { this.gnou_no_3 = gnou_no_3; }

    public String getGenur_no() { return genur_no; }
    public void setGenur_no(String genur_no) { this.genur_no = genur_no; }

    public String getGenkom_no() { return genkom_no; }
    public void setGenkom_no(String genkom_no) { this.genkom_no = genkom_no; }

    public Double getSu4v2_kt() { return su4v2_kt; }
    public void setSu4v2_kt(Double su4v2_kt) { this.su4v2_kt = su4v2_kt; }

    public Long getTan() { return tan; }
    public void setTan(Long tan) { this.tan = tan; }

    public Long getKitss() { return kitss; }
    public void setKitss(Long kitss) { this.kitss = kitss; }

    public String getNose_f() { return nose_f; }
    public void setNose_f(String nose_f) { this.nose_f = nose_f; }

    public Long getNose() { return nose; }
    public void setNose(Long nose) { this.nose = nose; }

    public Long getHasu() { return hasu; }
    public void setHasu(Long hasu) { this.hasu = hasu; }

    public Long getMmori() { return mmori; }
    public void setMmori(Long mmori) { this.mmori = mmori; }

    public Double getSaisya() { return saisya; }
    public void setSaisya(Double saisya) { this.saisya = saisya; }

    public Long getYg_tat() { return yg_tat; }
    public void setYg_tat(Long yg_tat) { this.yg_tat = yg_tat; }

    public Double getYgr_tat() { return ygr_tat; }
    public void setYgr_tat(Double ygr_tat) { this.ygr_tat = ygr_tat; }

    public Long getYg_tatz() { return yg_tatz; }
    public void setYg_tatz(Long yg_tatz) { this.yg_tatz = yg_tatz; }

    public Double getYg_tatzr() { return yg_tatzr; }
    public void setYg_tatzr(Double yg_tatzr) { this.yg_tatzr = yg_tatzr; }

    public Long getYg_kai() { return yg_kai; }
    public void setYg_kai(Long yg_kai) { this.yg_kai = yg_kai; }

    public Double getYgr_kai() { return ygr_kai; }
    public void setYgr_kai(Double ygr_kai) { this.ygr_kai = ygr_kai; }

    public Long getYg_kaic() { return yg_kaic; }
    public void setYg_kaic(Long yg_kaic) { this.yg_kaic = yg_kaic; }

    public Double getYg_kaicr() { return yg_kaicr; }
    public void setYg_kaicr(Double yg_kaicr) { this.yg_kaicr = yg_kaicr; }

    public String getLki_ktni() { return lki_ktni; }
    public void setLki_ktni(String lki_ktni) { this.lki_ktni = lki_ktni; }

    public Integer getKhlkik() { return khlkik; }
    public void setKhlkik(Integer khlkik) { this.khlkik = khlkik; }

    public Integer getGte_haisu() { return gte_haisu; }
    public void setGte_haisu(Integer gte_haisu) { this.gte_haisu = gte_haisu; }

    public String getGngime_st() { return gngime_st; }
    public void setGngime_st(String gngime_st) { this.gngime_st = gngime_st; }

    public String getHaj_cd1() { return haj_cd1; }
    public void setHaj_cd1(String haj_cd1) { this.haj_cd1 = haj_cd1; }

    public String getGyo_cd1() { return gyo_cd1; }
    public void setGyo_cd1(String gyo_cd1) { this.gyo_cd1 = gyo_cd1; }

    public String getGken_cd1() { return gken_cd1; }
    public void setGken_cd1(String gken_cd1) { this.gken_cd1 = gken_cd1; }

    public Integer getGchyot_dt1() { return gchyot_dt1; }
    public void setGchyot_dt1(Integer gchyot_dt1) { this.gchyot_dt1 = gchyot_dt1; }

    public String getGngime_f1() { return gngime_f1; }
    public void setGngime_f1(String gngime_f1) { this.gngime_f1 = gngime_f1; }

    public String getGkenh_cd1() { return gkenh_cd1; }
    public void setGkenh_cd1(String gkenh_cd1) { this.gkenh_cd1 = gkenh_cd1; }

    public String getBetk_cd1() { return betk_cd1; }
    public void setBetk_cd1(String betk_cd1) { this.betk_cd1 = betk_cd1; }

    public Long getTatyot_g1() { return tatyot_g1; }
    public void setTatyot_g1(Long tatyot_g1) { this.tatyot_g1 = tatyot_g1; }

    public Long getKaiyot_g1() { return kaiyot_g1; }
    public void setKaiyot_g1(Long kaiyot_g1) { this.kaiyot_g1 = kaiyot_g1; }

    public String getHaj_cd2() { return haj_cd2; }
    public void setHaj_cd2(String haj_cd2) { this.haj_cd2 = haj_cd2; }

    public String getGyo_cd2() { return gyo_cd2; }
    public void setGyo_cd2(String gyo_cd2) { this.gyo_cd2 = gyo_cd2; }

    public String getGken_cd2() { return gken_cd2; }
    public void setGken_cd2(String gken_cd2) { this.gken_cd2 = gken_cd2; }

    public Integer getGchyot_dt2() { return gchyot_dt2; }
    public void setGchyot_dt2(Integer gchyot_dt2) { this.gchyot_dt2 = gchyot_dt2; }

    public String getGngime_f2() { return gngime_f2; }
    public void setGngime_f2(String gngime_f2) { this.gngime_f2 = gngime_f2; }

    public String getGkenh_cd2() { return gkenh_cd2; }
    public void setGkenh_cd2(String gkenh_cd2) { this.gkenh_cd2 = gkenh_cd2; }

    public String getBetk_cd2() { return betk_cd2; }
    public void setBetk_cd2(String betk_cd2) { this.betk_cd2 = betk_cd2; }

    public Long getTatyot_g2() { return tatyot_g2; }
    public void setTatyot_g2(Long tatyot_g2) { this.tatyot_g2 = tatyot_g2; }

    public Long getKaiyot_g2() { return kaiyot_g2; }
    public void setKaiyot_g2(Long kaiyot_g2) { this.kaiyot_g2 = kaiyot_g2; }

    public String getHaj_cd3() { return haj_cd3; }
    public void setHaj_cd3(String haj_cd3) { this.haj_cd3 = haj_cd3; }

    public String getGyo_cd3() { return gyo_cd3; }
    public void setGyo_cd3(String gyo_cd3) { this.gyo_cd3 = gyo_cd3; }

    public String getGken_cd3() { return gken_cd3; }
    public void setGken_cd3(String gken_cd3) { this.gken_cd3 = gken_cd3; }

    public Integer getGchyot_dt3() { return gchyot_dt3; }
    public void setGchyot_dt3(Integer gchyot_dt3) { this.gchyot_dt3 = gchyot_dt3; }

    public String getGngime_f3() { return gngime_f3; }
    public void setGngime_f3(String gngime_f3) { this.gngime_f3 = gngime_f3; }

    public String getGkenh_cd3() { return gkenh_cd3; }
    public void setGkenh_cd3(String gkenh_cd3) { this.gkenh_cd3 = gkenh_cd3; }

    public String getBetk_cd3() { return betk_cd3; }
    public void setBetk_cd3(String betk_cd3) { this.betk_cd3 = betk_cd3; }

    public Long getTatyot_g3() { return tatyot_g3; }
    public void setTatyot_g3(Long tatyot_g3) { this.tatyot_g3 = tatyot_g3; }

    public Long getKaiyot_g3() { return kaiyot_g3; }
    public void setKaiyot_g3(Long kaiyot_g3) { this.kaiyot_g3 = kaiyot_g3; }

    public String getSekizai_f() { return sekizai_f; }
    public void setSekizai_f(String sekizai_f) { this.sekizai_f = sekizai_f; }
}
