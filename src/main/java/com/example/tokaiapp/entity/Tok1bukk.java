package com.example.tokaiapp.entity;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tok1bukk")
public class Tok1bukk {

    @EmbeddedId
    @JsonUnwrapped
    private Tok1bukkId id;

    @Column(name = "bu_bun_rui")
    private String bu_bun_rui;

    @ManyToOne
    @JoinColumns({
        @JoinColumn(name = "jyu_ji_cd", referencedColumnName = "jyu_ji_cd", insertable = false, updatable = false),
        @JoinColumn(name = "an_no", referencedColumnName = "an_no", insertable = false, updatable = false)
    })
    private Tok1ankk tok1ankk;

    public Tok1bukk() {}

    public Tok1bukkId getId() { return id; }
    public void setId(Tok1bukkId id) { this.id = id; }

    public String getBu_bun_rui() { return bu_bun_rui; }
    public void setBu_bun_rui(String bu_bun_rui) { this.bu_bun_rui = bu_bun_rui; }

    public Tok1ankk getTok1ankk() { return tok1ankk; }
    public void setTok1ankk(Tok1ankk tok1ankk) { this.tok1ankk = tok1ankk; }
}
