package com.example.tokaiapp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tokaiapp.entity.Tok1bukk;
import com.example.tokaiapp.entity.Tok1bukkId;
import com.example.tokaiapp.service.Tok1bukkService;

@RestController
@RequestMapping("/tkapi/tok1bukk")
public class Tok1bukkController {

    private final Tok1bukkService tok1bukkService;

    public Tok1bukkController(Tok1bukkService tok1bukkService) {
        this.tok1bukkService = tok1bukkService;
    }

    @GetMapping
    public List<Tok1bukk> findAll() {
        return tok1bukkService.findAll();
    }

    @GetMapping("/{jyuJiCd}/{anNo}/{buNo}")
    public ResponseEntity<Tok1bukk> findById(
            @PathVariable String jyuJiCd,
            @PathVariable String anNo,
            @PathVariable String buNo) {
        Tok1bukkId id = new Tok1bukkId(jyuJiCd, anNo, buNo);
        return tok1bukkService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tok1bukk save(@RequestBody Tok1bukk tok1bukk) {
        return tok1bukkService.save(tok1bukk);
    }
}
