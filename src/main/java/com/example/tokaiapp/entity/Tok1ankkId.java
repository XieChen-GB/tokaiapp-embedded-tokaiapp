package com.example.tokaiapp.entity;

import java.io.Serializable;

public class Tok1ankkId implements Serializable{
    private String jyu_ji_cd;
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((jyu_ji_cd == null) ? 0 : jyu_ji_cd.hashCode());
        result = prime * result + ((an_no == null) ? 0 : an_no.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tok1ankkId other = (Tok1ankkId) obj;
        if (jyu_ji_cd == null) {
            if (other.jyu_ji_cd != null)
                return false;
        } else if (!jyu_ji_cd.equals(other.jyu_ji_cd))
            return false;
        if (an_no == null) {
            if (other.an_no != null)
                return false;
        } else if (!an_no.equals(other.an_no))
            return false;
        return true;
    }
    
}
