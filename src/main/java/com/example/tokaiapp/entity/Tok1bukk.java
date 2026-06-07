package com.example.tokaiapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tok1bukk")
@IdClass(Tok1bukkId.class)
public class Tok1bukk {

    @Id
    @Column(name = "jyu_ji_cd")
    private String jyu_ji_cd;

    @Id
    @Column(name = "an_no")
    private String an_no;

    @Id
    @Column(name = "bu_no")
    private String bu_no;

    @Column(name = "bu_bun_rui")
    private String bu_bun_rui;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "jyu_ji_cd", referencedColumnName = "jyu_ji_cd", insertable = false, updatable = false),
        @JoinColumn(name = "an_no", referencedColumnName = "an_no", insertable = false, updatable = false)
    })
    private Tok1ankk tok1ankk;

    public Tok1bukk() {}

    public String getJyu_ji_cd() { return jyu_ji_cd; }
    public void setJyu_ji_cd(String jyu_ji_cd) { this.jyu_ji_cd = jyu_ji_cd; }

    public String getAn_no() { return an_no; }
    public void setAn_no(String an_no) { this.an_no = an_no; }

    public String getBu_no() { return bu_no; }
    public void setBu_no(String bu_no) { this.bu_no = bu_no; }

    public String getBu_bun_rui() { return bu_bun_rui; }
    public void setBu_bun_rui(String bu_bun_rui) { this.bu_bun_rui = bu_bun_rui; }

    public Tok1ankk getTok1ankk() { return tok1ankk; }
    public void setTok1ankk(Tok1ankk tok1ankk) { this.tok1ankk = tok1ankk; }
}
