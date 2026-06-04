package com.example.tokaiapp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tmk1tkui")
public class Tmk1tkui {

    @Id
    @Column(name = "tk_cd")
    private String tk_cd;

    @Column(name = "tk_name")
    private String tk_name;

    public Tmk1tkui() {}

    public String getTk_cd() {
        return tk_cd;
    }

    public void setTk_cd(String tk_cd) {
        this.tk_cd = tk_cd;
    }

    public String getTk_name() {
        return tk_name;
    }

    public void setTk_name(String tk_name) {
        this.tk_name = tk_name;
    }
}
