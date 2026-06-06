package com.example.tokaiapp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tokaiapp.entity.Tok1ankk;
import com.example.tokaiapp.entity.Tok1ankkId;
import com.example.tokaiapp.service.Tok1ankkService;

@RestController
@RequestMapping("/tkapi/tok1ankk")
public class Tok1ankkController {

    private final Tok1ankkService tok1ankkService;

    public Tok1ankkController(Tok1ankkService tok1ankkService) {
        this.tok1ankkService = tok1ankkService;
    }

    @GetMapping
    public List<Tok1ankk> findAll() {
        return tok1ankkService.findAll();
    }

    @GetMapping("/{jyuJiCd}/{anNo}")
    public ResponseEntity<Tok1ankk> findById(
            @PathVariable String jyuJiCd,
            @PathVariable String anNo) {
        Tok1ankkId id = new Tok1ankkId(jyuJiCd, anNo);
        return tok1ankkService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tok1ankk save(@RequestBody Tok1ankk tok1ankk) {
        return tok1ankkService.save(tok1ankk);
    }
}
