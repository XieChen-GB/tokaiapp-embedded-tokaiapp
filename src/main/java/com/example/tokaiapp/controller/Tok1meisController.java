package com.example.tokaiapp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tokaiapp.entity.Tok1meis;
import com.example.tokaiapp.entity.Tok1meisId;
import com.example.tokaiapp.service.Tok1meisService;

@RestController
@RequestMapping("/tkapi/tok1meis")
public class Tok1meisController {

    private final Tok1meisService tok1meisService;

    public Tok1meisController(Tok1meisService tok1meisService) {
        this.tok1meisService = tok1meisService;
    }

    @GetMapping
    public List<Tok1meis> findAll() {
        return tok1meisService.findAll();
    }

    @GetMapping("/{jyuJiCd}/{anNo}/{buNo}/{urNo}/{meikNo}")
    public ResponseEntity<Tok1meis> findById(
            @PathVariable String jyuJiCd,
            @PathVariable String anNo,
            @PathVariable String buNo,
            @PathVariable String urNo,
            @PathVariable String meikNo) {
        Tok1meisId id = new Tok1meisId(jyuJiCd, anNo, buNo, urNo, meikNo);
        return tok1meisService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tok1meis save(@RequestBody Tok1meis tok1meis) {
        return tok1meisService.save(tok1meis);
    }
}
