package com.example.tokaiapp.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Tmk1tkuiId implements Serializable {

    @Column(name = "ji_cd")
    private String jiCd;

    @Column(name = "toku_cd")
    private String tokuCd;

    @Column(name = "tkji_cd")
    private String tkjiCd;

    public Tmk1tkuiId() {}

    public Tmk1tkuiId(String jiCd, String tokuCd, String tkjiCd) {
        this.jiCd = jiCd;
        this.tokuCd = tokuCd;
        this.tkjiCd = tkjiCd;
    }

    public String getJiCd() { return jiCd; }
    public void setJiCd(String jiCd) { this.jiCd = jiCd; }

    public String getTokuCd() { return tokuCd; }
    public void setTokuCd(String tokuCd) { this.tokuCd = tokuCd; }

    public String getTkjiCd() { return tkjiCd; }
    public void setTkjiCd(String tkjiCd) { this.tkjiCd = tkjiCd; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tmk1tkuiId that = (Tmk1tkuiId) o;
        return Objects.equals(jiCd, that.jiCd)
                && Objects.equals(tokuCd, that.tokuCd)
                && Objects.equals(tkjiCd, that.tkjiCd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jiCd, tokuCd, tkjiCd);
    }
}
