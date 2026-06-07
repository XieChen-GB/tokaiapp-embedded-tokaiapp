package com.example.tokaiapp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tokaiapp.entity.Tmk6jyou;
import com.example.tokaiapp.service.Tmk6jyouService;

@RestController
@RequestMapping("/tkapi/tmk6jyou")
public class Tmk6jyouController {

    private final Tmk6jyouService tmk6jyouService;

    public Tmk6jyouController(Tmk6jyouService tmk6jyouService) {
        this.tmk6jyouService = tmk6jyouService;
    }

    @GetMapping
    public List<Tmk6jyou> findAll() {
        return tmk6jyouService.findAll();
    }

    @GetMapping("/{jiCd}")
    public ResponseEntity<Tmk6jyou> findById(@PathVariable String jiCd) {
        return tmk6jyouService.findById(jiCd)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tmk6jyou save(@RequestBody Tmk6jyou tmk6jyou) {
        return tmk6jyouService.save(tmk6jyou);
    }
}
