package com.example.tokaiapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tok1ankk")
@IdClass(Tok1ankkId.class)
public class Tok1ankk {

    // --- フィールド ---
    @Id
    @Column(name = "jyu_ji_cd")
    private String jyu_ji_cd;

    @Id
    @Column(name = "an_no")
    private String an_no;

    @ManyToOne
    @JoinColumn(name = "tk_cd")
    private Tmk1tkui tmk1tkui;

    @Column(name = "genba_name")
    private String genba_name;

    // --- コンストラクタ ---
    public Tok1ankk() {}

    // --- getter / setter ---
    public String getJyu_ji_cd() {
        return jyu_ji_cd;
    }

    public void setJyu_ji_cd(String jyu_ji_cd) {
        this.jyu_ji_cd = jyu_ji_cd;
    }

    public String getAn_no() {
        return an_no;
    }

    public void setAn_no(String an_no) {
        this.an_no = an_no;
    }

    public Tmk1tkui getTmk1tkui() {
        return tmk1tkui;
    }

    public void setTmk1tkui(Tmk1tkui tmk1tkui) {
        this.tmk1tkui = tmk1tkui;
    }

    public String getGenba_name() {
        return genba_name;
    }

    public void setGenba_name(String genba_name) {
        this.genba_name = genba_name;
    }
}
