package com.example.tokaiapp.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Tok1bukkId implements Serializable {

    @Column(name = "jyu_ji_cd")
    private String jyuJiCd;

    @Column(name = "an_no")
    private String anNo;

    @Column(name = "bu_no")
    private String buNo;

    public Tok1bukkId() {}

    public Tok1bukkId(String jyuJiCd, String anNo, String buNo) {
        this.jyuJiCd = jyuJiCd;
        this.anNo = anNo;
        this.buNo = buNo;
    }

    public String getJyuJiCd() { return jyuJiCd; }
    public void setJyuJiCd(String jyuJiCd) { this.jyuJiCd = jyuJiCd; }

    public String getAnNo() { return anNo; }
    public void setAnNo(String anNo) { this.anNo = anNo; }

    public String getBuNo() { return buNo; }
    public void setBuNo(String buNo) { this.buNo = buNo; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tok1bukkId that = (Tok1bukkId) o;
        return Objects.equals(jyuJiCd, that.jyuJiCd)
                && Objects.equals(anNo, that.anNo)
                && Objects.equals(buNo, that.buNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jyuJiCd, anNo, buNo);
    }
}
