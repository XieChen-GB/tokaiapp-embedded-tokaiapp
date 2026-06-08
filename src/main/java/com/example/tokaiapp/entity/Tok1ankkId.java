package com.example.tokaiapp.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Tok1ankkId implements Serializable {

    @Column(name = "jyu_ji_cd")
    private String jyu_ji_cd;

    @Column(name = "an_no")
    private String an_no;

    public Tok1ankkId() {}

    public Tok1ankkId(String jyu_ji_cd, String an_no) {
        this.jyu_ji_cd = jyu_ji_cd;
        this.an_no = an_no;
    }

    public String getJyu_ji_cd() { return jyu_ji_cd; }
    public void setJyu_ji_cd(String jyu_ji_cd) { this.jyu_ji_cd = jyu_ji_cd; }

    public String getAn_no() { return an_no; }
    public void setAn_no(String an_no) { this.an_no = an_no; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tok1ankkId that = (Tok1ankkId) o;
        return Objects.equals(jyu_ji_cd, that.jyu_ji_cd)
                && Objects.equals(an_no, that.an_no);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jyu_ji_cd, an_no);
    }
}
