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
    private String buSyu;

    @Column(name = "hikib_nr")
    private String hikibNr;

    @Column(name = "koyo_hikb")
    private String koyoHikb;

    @Column(name = "kote_kb")
    private String koteKb;

    @Column(name = "agu_rf")
    private String aguRf;

    @Column(name = "ngime_f")
    private String ngimeF;

    @Column(name = "hiki_dt")
    private Integer hikiDt;

    @Column(name = "kete_dt")
    private Integer keteDt;

    @Column(name = "sekokn_dt")
    private Integer sekoknDt;

    @Column(name = "chkibo_dt")
    private Integer chkiboDt;

    @Column(name = "knkibo_dt")
    private Integer knkiboDt;

    @Column(name = "knyote_dt")
    private Integer knyoteDt;

    @Column(name = "hriu_cd")
    private String hriuCd;

    @Column(name = "hriu_gyo")
    private String hriuGyo;

    @Column(name = "hike_dt")
    private Integer hikeDt;

    @Column(name = "lki_dt")
    private Integer lkiDt;

    @Column(name = "slki_dt")
    private Integer slkiDt;

    @Column(name = "hkjkn_dt")
    private Integer hkjknDt;

    @Column(name = "hskh_lkik")
    private Integer hskhLkik;

    @Column(name = "hski_ktni")
    private String hskiKtni;

    @Column(name = "mmout_st")
    private String mmoutSt;

    @Column(name = "kyak_no")
    private String kyakNo;

    @Column(name = "hojo_bnr")
    private String hojoBnr;

    @Column(name = "jyu_ka_cd")
    private String jyuKaCd;

    @Column(name = "tato_no")
    private String tatoNo;

    @Column(name = "uregyo_st")
    private String uregyoSt;

    @Column(name = "seko_st")
    private String sekoSt;

    @Column(name = "mondai_kst")
    private String mondaiKst;

    @Column(name = "ursiji_f")
    private String ursijiF;

    @Column(name = "gyoken_st")
    private String gyokenSt;

    @Column(name = "koyo_ten")
    private Integer koyoTen;

    @Column(name = "koyo_tet")
    private Integer koyoTet;

    @Column(name = "koyote_j")
    private String koyoteJ;

    @Column(name = "chyote_dt")
    private Integer chyoteDt;

    @Column(name = "urkjo_dt")
    private Integer urkjoDt;

    @Column(name = "lmn_dt")
    private Integer lmnDt;

    @Column(name = "ldy")
    private Integer ldy;

    @Column(name = "luk_dt")
    private Integer lukDt;

    @Column(name = "slkidt_f")
    private String slkidtF;

    @Column(name = "hipo_f")
    private String hipoF;

    @Column(name = "zen_est")
    private String zenEst;

    @Column(name = "mmori_gg")
    private Long mmoriGg;

    @Column(name = "nbiki")
    private Long nbiki;

    @Column(name = "szei_g")
    private Long szeiG;

    @Column(name = "uriszei_r")
    private Double uriszeiR;

    @Column(name = "ur_ygen")
    private Long urYgen;

    @Column(name = "ygen_tat")
    private Long ygenTat;

    @Column(name = "ygen_kai")
    private Long ygenKai;

    @Column(name = "ygen_hyo")
    private Long ygenHyo;

    @Column(name = "ygen_kou")
    private Long ygenKou;

    @Column(name = "siwake_no")
    private String siwakeNo;

    @Column(name = "meikno_max")
    private Integer meiknoMax;

    @Column(name = "tanzei_r")
    private Double tanzeiR;

    @Column(name = "tanzei_flg")
    private String tanzeiFlg;

    @Column(name = "zei_kb")
    private String zeiKb;

    public Tok1uria() {}

    public Tok1uriaId getId() { return id; }
    public void setId(Tok1uriaId id) { this.id = id; }

    public String getBuSyu() { return buSyu; }
    public void setBuSyu(String buSyu) { this.buSyu = buSyu; }

    public String getHikibNr() { return hikibNr; }
    public void setHikibNr(String hikibNr) { this.hikibNr = hikibNr; }

    public String getKoyoHikb() { return koyoHikb; }
    public void setKoyoHikb(String koyoHikb) { this.koyoHikb = koyoHikb; }

    public String getKoteKb() { return koteKb; }
    public void setKoteKb(String koteKb) { this.koteKb = koteKb; }

    public String getAguRf() { return aguRf; }
    public void setAguRf(String aguRf) { this.aguRf = aguRf; }

    public String getNgimeF() { return ngimeF; }
    public void setNgimeF(String ngimeF) { this.ngimeF = ngimeF; }

    public Integer getHikiDt() { return hikiDt; }
    public void setHikiDt(Integer hikiDt) { this.hikiDt = hikiDt; }

    public Integer getKeteDt() { return keteDt; }
    public void setKeteDt(Integer keteDt) { this.keteDt = keteDt; }

    public Integer getSekoknDt() { return sekoknDt; }
    public void setSekoknDt(Integer sekoknDt) { this.sekoknDt = sekoknDt; }

    public Integer getChkiboDt() { return chkiboDt; }
    public void setChkiboDt(Integer chkiboDt) { this.chkiboDt = chkiboDt; }

    public Integer getKnkiboDt() { return knkiboDt; }
    public void setKnkiboDt(Integer knkiboDt) { this.knkiboDt = knkiboDt; }

    public Integer getKnyoteDt() { return knyoteDt; }
    public void setKnyoteDt(Integer knyoteDt) { this.knyoteDt = knyoteDt; }

    public String getHriuCd() { return hriuCd; }
    public void setHriuCd(String hriuCd) { this.hriuCd = hriuCd; }

    public String getHriuGyo() { return hriuGyo; }
    public void setHriuGyo(String hriuGyo) { this.hriuGyo = hriuGyo; }

    public Integer getHikeDt() { return hikeDt; }
    public void setHikeDt(Integer hikeDt) { this.hikeDt = hikeDt; }

    public Integer getLkiDt() { return lkiDt; }
    public void setLkiDt(Integer lkiDt) { this.lkiDt = lkiDt; }

    public Integer getSlkiDt() { return slkiDt; }
    public void setSlkiDt(Integer slkiDt) { this.slkiDt = slkiDt; }

    public Integer getHkjknDt() { return hkjknDt; }
    public void setHkjknDt(Integer hkjknDt) { this.hkjknDt = hkjknDt; }

    public Integer getHskhLkik() { return hskhLkik; }
    public void setHskhLkik(Integer hskhLkik) { this.hskhLkik = hskhLkik; }

    public String getHskiKtni() { return hskiKtni; }
    public void setHskiKtni(String hskiKtni) { this.hskiKtni = hskiKtni; }

    public String getMmoutSt() { return mmoutSt; }
    public void setMmoutSt(String mmoutSt) { this.mmoutSt = mmoutSt; }

    public String getKyakNo() { return kyakNo; }
    public void setKyakNo(String kyakNo) { this.kyakNo = kyakNo; }

    public String getHojoBnr() { return hojoBnr; }
    public void setHojoBnr(String hojoBnr) { this.hojoBnr = hojoBnr; }

    public String getJyuKaCd() { return jyuKaCd; }
    public void setJyuKaCd(String jyuKaCd) { this.jyuKaCd = jyuKaCd; }

    public String getTatoNo() { return tatoNo; }
    public void setTatoNo(String tatoNo) { this.tatoNo = tatoNo; }

    public String getUregyoSt() { return uregyoSt; }
    public void setUregyoSt(String uregyoSt) { this.uregyoSt = uregyoSt; }

    public String getSekoSt() { return sekoSt; }
    public void setSekoSt(String sekoSt) { this.sekoSt = sekoSt; }

    public String getMondaiKst() { return mondaiKst; }
    public void setMondaiKst(String mondaiKst) { this.mondaiKst = mondaiKst; }

    public String getUrsijiF() { return ursijiF; }
    public void setUrsijiF(String ursijiF) { this.ursijiF = ursijiF; }

    public String getGyokenSt() { return gyokenSt; }
    public void setGyokenSt(String gyokenSt) { this.gyokenSt = gyokenSt; }

    public Integer getKoyoTen() { return koyoTen; }
    public void setKoyoTen(Integer koyoTen) { this.koyoTen = koyoTen; }

    public Integer getKoyoTet() { return koyoTet; }
    public void setKoyoTet(Integer koyoTet) { this.koyoTet = koyoTet; }

    public String getKoyoteJ() { return koyoteJ; }
    public void setKoyoteJ(String koyoteJ) { this.koyoteJ = koyoteJ; }

    public Integer getChyoteDt() { return chyoteDt; }
    public void setChyoteDt(Integer chyoteDt) { this.chyoteDt = chyoteDt; }

    public Integer getUrkjoDt() { return urkjoDt; }
    public void setUrkjoDt(Integer urkjoDt) { this.urkjoDt = urkjoDt; }

    public Integer getLmnDt() { return lmnDt; }
    public void setLmnDt(Integer lmnDt) { this.lmnDt = lmnDt; }

    public Integer getLdy() { return ldy; }
    public void setLdy(Integer ldy) { this.ldy = ldy; }

    public Integer getLukDt() { return lukDt; }
    public void setLukDt(Integer lukDt) { this.lukDt = lukDt; }

    public String getSlkidtF() { return slkidtF; }
    public void setSlkidtF(String slkidtF) { this.slkidtF = slkidtF; }

    public String getHipoF() { return hipoF; }
    public void setHipoF(String hipoF) { this.hipoF = hipoF; }

    public String getZenEst() { return zenEst; }
    public void setZenEst(String zenEst) { this.zenEst = zenEst; }

    public Long getMmoriGg() { return mmoriGg; }
    public void setMmoriGg(Long mmoriGg) { this.mmoriGg = mmoriGg; }

    public Long getNbiki() { return nbiki; }
    public void setNbiki(Long nbiki) { this.nbiki = nbiki; }

    public Long getSzeiG() { return szeiG; }
    public void setSzeiG(Long szeiG) { this.szeiG = szeiG; }

    public Double getUriszeiR() { return uriszeiR; }
    public void setUriszeiR(Double uriszeiR) { this.uriszeiR = uriszeiR; }

    public Long getUrYgen() { return urYgen; }
    public void setUrYgen(Long urYgen) { this.urYgen = urYgen; }

    public Long getYgenTat() { return ygenTat; }
    public void setYgenTat(Long ygenTat) { this.ygenTat = ygenTat; }

    public Long getYgenKai() { return ygenKai; }
    public void setYgenKai(Long ygenKai) { this.ygenKai = ygenKai; }

    public Long getYgenHyo() { return ygenHyo; }
    public void setYgenHyo(Long ygenHyo) { this.ygenHyo = ygenHyo; }

    public Long getYgenKou() { return ygenKou; }
    public void setYgenKou(Long ygenKou) { this.ygenKou = ygenKou; }

    public String getSiwakeNo() { return siwakeNo; }
    public void setSiwakeNo(String siwakeNo) { this.siwakeNo = siwakeNo; }

    public Integer getMeiknoMax() { return meiknoMax; }
    public void setMeiknoMax(Integer meiknoMax) { this.meiknoMax = meiknoMax; }

    public Double getTanzeiR() { return tanzeiR; }
    public void setTanzeiR(Double tanzeiR) { this.tanzeiR = tanzeiR; }

    public String getTanzeiFlg() { return tanzeiFlg; }
    public void setTanzeiFlg(String tanzeiFlg) { this.tanzeiFlg = tanzeiFlg; }

    public String getZeiKb() { return zeiKb; }
    public void setZeiKb(String zeiKb) { this.zeiKb = zeiKb; }
}
