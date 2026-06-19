package com.example.tokaiapp.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Tok1ankkId implements Serializable {

    @Column(name = "jyu_ji_cd")
    private String jyuJiCd;

    @Column(name = "an_no")
    private String anNo;

    public Tok1ankkId() {}

    public Tok1ankkId(String jyuJiCd, String anNo) {
        this.jyuJiCd = jyuJiCd;
        this.anNo = anNo;
    }

    public String getJyuJiCd() { return jyuJiCd; }
    public void setJyuJiCd(String jyuJiCd) { this.jyuJiCd = jyuJiCd; }

    public String getAnNo() { return anNo; }
    public void setAnNo(String anNo) { this.anNo = anNo; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tok1ankkId that = (Tok1ankkId) o;
        return Objects.equals(jyuJiCd, that.jyuJiCd)
                && Objects.equals(anNo, that.anNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jyuJiCd, anNo);
    }
}
