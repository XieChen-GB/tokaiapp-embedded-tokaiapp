package com.example.tokaiapp.entity;

import java.io.Serializable;
import java.util.Objects;

public class Tok1bukkId implements Serializable {

    private String jyu_ji_cd;
    private String an_no;
    private String bu_no;

    public Tok1bukkId() {}

    public Tok1bukkId(String jyu_ji_cd, String an_no, String bu_no) {
        this.jyu_ji_cd = jyu_ji_cd;
        this.an_no = an_no;
        this.bu_no = bu_no;
    }

    public String getJyu_ji_cd() { return jyu_ji_cd; }
    public void setJyu_ji_cd(String jyu_ji_cd) { this.jyu_ji_cd = jyu_ji_cd; }

    public String getAn_no() { return an_no; }
    public void setAn_no(String an_no) { this.an_no = an_no; }

    public String getBu_no() { return bu_no; }
    public void setBu_no(String bu_no) { this.bu_no = bu_no; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tok1bukkId that = (Tok1bukkId) o;
        return Objects.equals(jyu_ji_cd, that.jyu_ji_cd)
                && Objects.equals(an_no, that.an_no)
                && Objects.equals(bu_no, that.bu_no);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jyu_ji_cd, an_no, bu_no);
    }
}
