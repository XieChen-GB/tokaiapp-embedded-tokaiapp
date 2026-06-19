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
    private String buSyu;

    @Column(name = "kom_cd")
    private String komCd;

    @Column(name = "kom_nm")
    private String komNm;

    @Column(name = "tni_cd")
    private String tniCd;

    @Column(name = "koyo_f")
    private String koyoF;

    @Column(name = "mmorig_cd")
    private String mmorigCd;

    @Column(name = "mmorig_nm")
    private String mmorigNm;

    @Column(name = "ki_su")
    private String kiSu;

    @Column(name = "bkase_f")
    private String bkaseF;

    @Column(name = "kazei_f")
    private String kazeiF;

    @Column(name = "uhkam_cd")
    private String uhkamCd;

    @Column(name = "kkanz_cd")
    private String kkanzCd;

    @Column(name = "ghkam_cd")
    private String ghkamCd;

    @Column(name = "thk_f")
    private String thkF;

    @Column(name = "sesaur_f")
    private String sesaurF;

    @Column(name = "ygenss_kb")
    private String ygenssKb;

    @Column(name = "gkand1_dt")
    private Integer gkand1Dt;

    @Column(name = "gkend1_dt")
    private Integer gkend1Dt;

    @Column(name = "gnou_no_1")
    private String gnouNo1;

    @Column(name = "gkand2_dt")
    private Integer gkand2Dt;

    @Column(name = "gkend2_dt")
    private Integer gkend2Dt;

    @Column(name = "gnou_no_2")
    private String gnouNo2;

    @Column(name = "gkand3_dt")
    private Integer gkand3Dt;

    @Column(name = "gkend3_dt")
    private Integer gkend3Dt;

    @Column(name = "gnou_no_3")
    private String gnouNo3;

    @Column(name = "genur_no")
    private String genurNo;

    @Column(name = "genkom_no")
    private String genkomNo;

    @Column(name = "su4v2_kt")
    private Double su4v2Kt;

    @Column(name = "tan")
    private Long tan;

    @Column(name = "kitss")
    private Long kitss;

    @Column(name = "nose_f")
    private String noseF;

    @Column(name = "nose")
    private Long nose;

    @Column(name = "hasu")
    private Long hasu;

    @Column(name = "mmori")
    private Long mmori;

    @Column(name = "mmori_gg")
    private Long mmoriGg;

    @Column(name = "saisya")
    private Double saisya;

    @Column(name = "yg_tat")
    private Long ygTat;

    @Column(name = "ygr_tat")
    private Double ygrTat;

    @Column(name = "yg_tatz")
    private Long ygTatz;

    @Column(name = "yg_tatzr")
    private Double ygTatzr;

    @Column(name = "yg_kai")
    private Long ygKai;

    @Column(name = "ygr_kai")
    private Double ygrKai;

    @Column(name = "yg_kaic")
    private Long ygKaic;

    @Column(name = "yg_kaicr")
    private Double ygKaicr;

    @Column(name = "lki_ktni")
    private String lkiKtni;

    @Column(name = "khlkik")
    private Integer khlkik;

    @Column(name = "gte_haisu")
    private Integer gteHaisu;

    @Column(name = "gngime_st")
    private String gngimeSt;

    @Column(name = "haj_cd1")
    private String hajCd1;

    @Column(name = "gyo_cd1")
    private String gyoCd1;

    @Column(name = "gken_cd1")
    private String gkenCd1;

    @Column(name = "gchyot_dt1")
    private Integer gchyotDt1;

    @Column(name = "gngime_f1")
    private String gngimeF1;

    @Column(name = "gkenh_cd1")
    private String gkenhCd1;

    @Column(name = "betk_cd1")
    private String betkCd1;

    @Column(name = "tatyot_g1")
    private Long tatyotG1;

    @Column(name = "kaiyot_g1")
    private Long kaiyotG1;

    @Column(name = "haj_cd2")
    private String hajCd2;

    @Column(name = "gyo_cd2")
    private String gyoCd2;

    @Column(name = "gken_cd2")
    private String gkenCd2;

    @Column(name = "gchyot_dt2")
    private Integer gchyotDt2;

    @Column(name = "gngime_f2")
    private String gngimeF2;

    @Column(name = "gkenh_cd2")
    private String gkenhCd2;

    @Column(name = "betk_cd2")
    private String betkCd2;

    @Column(name = "tatyot_g2")
    private Long tatyotG2;

    @Column(name = "kaiyot_g2")
    private Long kaiyotG2;

    @Column(name = "haj_cd3")
    private String hajCd3;

    @Column(name = "gyo_cd3")
    private String gyoCd3;

    @Column(name = "gken_cd3")
    private String gkenCd3;

    @Column(name = "gchyot_dt3")
    private Integer gchyotDt3;

    @Column(name = "gngime_f3")
    private String gngimeF3;

    @Column(name = "gkenh_cd3")
    private String gkenhCd3;

    @Column(name = "betk_cd3")
    private String betkCd3;

    @Column(name = "tatyot_g3")
    private Long tatyotG3;

    @Column(name = "kaiyot_g3")
    private Long kaiyotG3;

    @Column(name = "sekizai_f")
    private String sekizaiF;

    public Tok1meis() {}

    public Tok1meisId getId() { return id; }
    public void setId(Tok1meisId id) { this.id = id; }

    public String getBuSyu() { return buSyu; }
    public void setBuSyu(String buSyu) { this.buSyu = buSyu; }

    public String getKomCd() { return komCd; }
    public void setKomCd(String komCd) { this.komCd = komCd; }

    public String getKomNm() { return komNm; }
    public void setKomNm(String komNm) { this.komNm = komNm; }

    public String getTniCd() { return tniCd; }
    public void setTniCd(String tniCd) { this.tniCd = tniCd; }

    public String getKoyoF() { return koyoF; }
    public void setKoyoF(String koyoF) { this.koyoF = koyoF; }

    public String getMmorigCd() { return mmorigCd; }
    public void setMmorigCd(String mmorigCd) { this.mmorigCd = mmorigCd; }

    public String getMmorigNm() { return mmorigNm; }
    public void setMmorigNm(String mmorigNm) { this.mmorigNm = mmorigNm; }

    public String getKiSu() { return kiSu; }
    public void setKiSu(String kiSu) { this.kiSu = kiSu; }

    public String getBkaseF() { return bkaseF; }
    public void setBkaseF(String bkaseF) { this.bkaseF = bkaseF; }

    public String getKazeiF() { return kazeiF; }
    public void setKazeiF(String kazeiF) { this.kazeiF = kazeiF; }

    public String getUhkamCd() { return uhkamCd; }
    public void setUhkamCd(String uhkamCd) { this.uhkamCd = uhkamCd; }

    public String getKkanzCd() { return kkanzCd; }
    public void setKkanzCd(String kkanzCd) { this.kkanzCd = kkanzCd; }

    public String getGhkamCd() { return ghkamCd; }
    public void setGhkamCd(String ghkamCd) { this.ghkamCd = ghkamCd; }

    public String getThkF() { return thkF; }
    public void setThkF(String thkF) { this.thkF = thkF; }

    public String getSesaurF() { return sesaurF; }
    public void setSesaurF(String sesaurF) { this.sesaurF = sesaurF; }

    public String getYgenssKb() { return ygenssKb; }
    public void setYgenssKb(String ygenssKb) { this.ygenssKb = ygenssKb; }

    public Integer getGkand1Dt() { return gkand1Dt; }
    public void setGkand1Dt(Integer gkand1Dt) { this.gkand1Dt = gkand1Dt; }

    public Integer getGkend1Dt() { return gkend1Dt; }
    public void setGkend1Dt(Integer gkend1Dt) { this.gkend1Dt = gkend1Dt; }

    public String getGnouNo1() { return gnouNo1; }
    public void setGnouNo1(String gnouNo1) { this.gnouNo1 = gnouNo1; }

    public Integer getGkand2Dt() { return gkand2Dt; }
    public void setGkand2Dt(Integer gkand2Dt) { this.gkand2Dt = gkand2Dt; }

    public Integer getGkend2Dt() { return gkend2Dt; }
    public void setGkend2Dt(Integer gkend2Dt) { this.gkend2Dt = gkend2Dt; }

    public String getGnouNo2() { return gnouNo2; }
    public void setGnouNo2(String gnouNo2) { this.gnouNo2 = gnouNo2; }

    public Integer getGkand3Dt() { return gkand3Dt; }
    public void setGkand3Dt(Integer gkand3Dt) { this.gkand3Dt = gkand3Dt; }

    public Integer getGkend3Dt() { return gkend3Dt; }
    public void setGkend3Dt(Integer gkend3Dt) { this.gkend3Dt = gkend3Dt; }

    public String getGnouNo3() { return gnouNo3; }
    public void setGnouNo3(String gnouNo3) { this.gnouNo3 = gnouNo3; }

    public String getGenurNo() { return genurNo; }
    public void setGenurNo(String genurNo) { this.genurNo = genurNo; }

    public String getGenkomNo() { return genkomNo; }
    public void setGenkomNo(String genkomNo) { this.genkomNo = genkomNo; }

    public Double getSu4v2Kt() { return su4v2Kt; }
    public void setSu4v2Kt(Double su4v2Kt) { this.su4v2Kt = su4v2Kt; }

    public Long getTan() { return tan; }
    public void setTan(Long tan) { this.tan = tan; }

    public Long getKitss() { return kitss; }
    public void setKitss(Long kitss) { this.kitss = kitss; }

    public String getNoseF() { return noseF; }
    public void setNoseF(String noseF) { this.noseF = noseF; }

    public Long getNose() { return nose; }
    public void setNose(Long nose) { this.nose = nose; }

    public Long getHasu() { return hasu; }
    public void setHasu(Long hasu) { this.hasu = hasu; }

    public Long getMmori() { return mmori; }
    public void setMmori(Long mmori) { this.mmori = mmori; }

    public Long getMmoriGg() { return mmoriGg; }
    public void setMmoriGg(Long mmoriGg) { this.mmoriGg = mmoriGg; }

    public Double getSaisya() { return saisya; }
    public void setSaisya(Double saisya) { this.saisya = saisya; }

    public Long getYgTat() { return ygTat; }
    public void setYgTat(Long ygTat) { this.ygTat = ygTat; }

    public Double getYgrTat() { return ygrTat; }
    public void setYgrTat(Double ygrTat) { this.ygrTat = ygrTat; }

    public Long getYgTatz() { return ygTatz; }
    public void setYgTatz(Long ygTatz) { this.ygTatz = ygTatz; }

    public Double getYgTatzr() { return ygTatzr; }
    public void setYgTatzr(Double ygTatzr) { this.ygTatzr = ygTatzr; }

    public Long getYgKai() { return ygKai; }
    public void setYgKai(Long ygKai) { this.ygKai = ygKai; }

    public Double getYgrKai() { return ygrKai; }
    public void setYgrKai(Double ygrKai) { this.ygrKai = ygrKai; }

    public Long getYgKaic() { return ygKaic; }
    public void setYgKaic(Long ygKaic) { this.ygKaic = ygKaic; }

    public Double getYgKaicr() { return ygKaicr; }
    public void setYgKaicr(Double ygKaicr) { this.ygKaicr = ygKaicr; }

    public String getLkiKtni() { return lkiKtni; }
    public void setLkiKtni(String lkiKtni) { this.lkiKtni = lkiKtni; }

    public Integer getKhlkik() { return khlkik; }
    public void setKhlkik(Integer khlkik) { this.khlkik = khlkik; }

    public Integer getGteHaisu() { return gteHaisu; }
    public void setGteHaisu(Integer gteHaisu) { this.gteHaisu = gteHaisu; }

    public String getGngimeSt() { return gngimeSt; }
    public void setGngimeSt(String gngimeSt) { this.gngimeSt = gngimeSt; }

    public String getHajCd1() { return hajCd1; }
    public void setHajCd1(String hajCd1) { this.hajCd1 = hajCd1; }

    public String getGyoCd1() { return gyoCd1; }
    public void setGyoCd1(String gyoCd1) { this.gyoCd1 = gyoCd1; }

    public String getGkenCd1() { return gkenCd1; }
    public void setGkenCd1(String gkenCd1) { this.gkenCd1 = gkenCd1; }

    public Integer getGchyotDt1() { return gchyotDt1; }
    public void setGchyotDt1(Integer gchyotDt1) { this.gchyotDt1 = gchyotDt1; }

    public String getGngimeF1() { return gngimeF1; }
    public void setGngimeF1(String gngimeF1) { this.gngimeF1 = gngimeF1; }

    public String getGkenhCd1() { return gkenhCd1; }
    public void setGkenhCd1(String gkenhCd1) { this.gkenhCd1 = gkenhCd1; }

    public String getBetkCd1() { return betkCd1; }
    public void setBetkCd1(String betkCd1) { this.betkCd1 = betkCd1; }

    public Long getTatyotG1() { return tatyotG1; }
    public void setTatyotG1(Long tatyotG1) { this.tatyotG1 = tatyotG1; }

    public Long getKaiyotG1() { return kaiyotG1; }
    public void setKaiyotG1(Long kaiyotG1) { this.kaiyotG1 = kaiyotG1; }

    public String getHajCd2() { return hajCd2; }
    public void setHajCd2(String hajCd2) { this.hajCd2 = hajCd2; }

    public String getGyoCd2() { return gyoCd2; }
    public void setGyoCd2(String gyoCd2) { this.gyoCd2 = gyoCd2; }

    public String getGkenCd2() { return gkenCd2; }
    public void setGkenCd2(String gkenCd2) { this.gkenCd2 = gkenCd2; }

    public Integer getGchyotDt2() { return gchyotDt2; }
    public void setGchyotDt2(Integer gchyotDt2) { this.gchyotDt2 = gchyotDt2; }

    public String getGngimeF2() { return gngimeF2; }
    public void setGngimeF2(String gngimeF2) { this.gngimeF2 = gngimeF2; }

    public String getGkenhCd2() { return gkenhCd2; }
    public void setGkenhCd2(String gkenhCd2) { this.gkenhCd2 = gkenhCd2; }

    public String getBetkCd2() { return betkCd2; }
    public void setBetkCd2(String betkCd2) { this.betkCd2 = betkCd2; }

    public Long getTatyotG2() { return tatyotG2; }
    public void setTatyotG2(Long tatyotG2) { this.tatyotG2 = tatyotG2; }

    public Long getKaiyotG2() { return kaiyotG2; }
    public void setKaiyotG2(Long kaiyotG2) { this.kaiyotG2 = kaiyotG2; }

    public String getHajCd3() { return hajCd3; }
    public void setHajCd3(String hajCd3) { this.hajCd3 = hajCd3; }

    public String getGyoCd3() { return gyoCd3; }
    public void setGyoCd3(String gyoCd3) { this.gyoCd3 = gyoCd3; }

    public String getGkenCd3() { return gkenCd3; }
    public void setGkenCd3(String gkenCd3) { this.gkenCd3 = gkenCd3; }

    public Integer getGchyotDt3() { return gchyotDt3; }
    public void setGchyotDt3(Integer gchyotDt3) { this.gchyotDt3 = gchyotDt3; }

    public String getGngimeF3() { return gngimeF3; }
    public void setGngimeF3(String gngimeF3) { this.gngimeF3 = gngimeF3; }

    public String getGkenhCd3() { return gkenhCd3; }
    public void setGkenhCd3(String gkenhCd3) { this.gkenhCd3 = gkenhCd3; }

    public String getBetkCd3() { return betkCd3; }
    public void setBetkCd3(String betkCd3) { this.betkCd3 = betkCd3; }

    public Long getTatyotG3() { return tatyotG3; }
    public void setTatyotG3(Long tatyotG3) { this.tatyotG3 = tatyotG3; }

    public Long getKaiyotG3() { return kaiyotG3; }
    public void setKaiyotG3(Long kaiyotG3) { this.kaiyotG3 = kaiyotG3; }

    public String getSekizaiF() { return sekizaiF; }
    public void setSekizaiF(String sekizaiF) { this.sekizaiF = sekizaiF; }
}
