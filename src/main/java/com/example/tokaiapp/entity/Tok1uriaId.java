package com.example.tokaiapp.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Tok1uriaId implements Serializable {

    @Column(name = "jyu_ji_cd")
    private String jyuJiCd;

    @Column(name = "an_no")
    private String anNo;

    @Column(name = "bu_no")
    private String buNo;

    @Column(name = "ur_no")
    private String urNo;

    public Tok1uriaId() {}

    public Tok1uriaId(String jyuJiCd, String anNo, String buNo, String urNo) {
        this.jyuJiCd = jyuJiCd;
        this.anNo = anNo;
        this.buNo = buNo;
        this.urNo = urNo;
    }

    public String getJyuJiCd() { return jyuJiCd; }
    public void setJyuJiCd(String jyuJiCd) { this.jyuJiCd = jyuJiCd; }

    public String getAnNo() { return anNo; }
    public void setAnNo(String anNo) { this.anNo = anNo; }

    public String getBuNo() { return buNo; }
    public void setBuNo(String buNo) { this.buNo = buNo; }

    public String getUrNo() { return urNo; }
    public void setUrNo(String urNo) { this.urNo = urNo; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tok1uriaId that = (Tok1uriaId) o;
        return Objects.equals(jyuJiCd, that.jyuJiCd)
                && Objects.equals(anNo, that.anNo)
                && Objects.equals(buNo, that.buNo)
                && Objects.equals(urNo, that.urNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jyuJiCd, anNo, buNo, urNo);
    }
}
