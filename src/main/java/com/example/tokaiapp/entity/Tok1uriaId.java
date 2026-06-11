package com.example.tokaiapp.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Tok1uriaId implements Serializable {

    @Column(name = "jyu_ji_cd")
    private String jyu_ji_cd;

    @Column(name = "an_no")
    private String an_no;

    @Column(name = "bu_no")
    private String bu_no;

    @Column(name = "ur_no")
    private String ur_no;

    public Tok1uriaId() {}

    public Tok1uriaId(String jyu_ji_cd, String an_no, String bu_no, String ur_no) {
        this.jyu_ji_cd = jyu_ji_cd;
        this.an_no = an_no;
        this.bu_no = bu_no;
        this.ur_no = ur_no;
    }

    public String getJyu_ji_cd() { return jyu_ji_cd; }
    public void setJyu_ji_cd(String jyu_ji_cd) { this.jyu_ji_cd = jyu_ji_cd; }

    public String getAn_no() { return an_no; }
    public void setAn_no(String an_no) { this.an_no = an_no; }

    public String getBu_no() { return bu_no; }
    public void setBu_no(String bu_no) { this.bu_no = bu_no; }

    public String getUr_no() { return ur_no; }
    public void setUr_no(String ur_no) { this.ur_no = ur_no; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tok1uriaId that = (Tok1uriaId) o;
        return Objects.equals(jyu_ji_cd, that.jyu_ji_cd)
                && Objects.equals(an_no, that.an_no)
                && Objects.equals(bu_no, that.bu_no)
                && Objects.equals(ur_no, that.ur_no);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jyu_ji_cd, an_no, bu_no, ur_no);
    }
}
