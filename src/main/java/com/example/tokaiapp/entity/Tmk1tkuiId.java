package com.example.tokaiapp.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Tmk1tkuiId implements Serializable {

    @Column(name = "ji_cd")
    private String ji_cd;

    @Column(name = "toku_cd")
    private String toku_cd;

    @Column(name = "tkji_cd")
    private String tkji_cd;

    public Tmk1tkuiId() {}

    public Tmk1tkuiId(String ji_cd, String toku_cd, String tkji_cd) {
        this.ji_cd = ji_cd;
        this.toku_cd = toku_cd;
        this.tkji_cd = tkji_cd;
    }

    public String getJi_cd() { return ji_cd; }
    public void setJi_cd(String ji_cd) { this.ji_cd = ji_cd; }

    public String getToku_cd() { return toku_cd; }
    public void setToku_cd(String toku_cd) { this.toku_cd = toku_cd; }

    public String getTkji_cd() { return tkji_cd; }
    public void setTkji_cd(String tkji_cd) { this.tkji_cd = tkji_cd; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tmk1tkuiId that = (Tmk1tkuiId) o;
        return Objects.equals(ji_cd, that.ji_cd)
                && Objects.equals(toku_cd, that.toku_cd)
                && Objects.equals(tkji_cd, that.tkji_cd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ji_cd, toku_cd, tkji_cd);
    }
}
