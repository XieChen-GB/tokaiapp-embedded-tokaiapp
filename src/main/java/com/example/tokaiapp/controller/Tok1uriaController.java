package com.example.tokaiapp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tokaiapp.entity.Tok1uria;
import com.example.tokaiapp.entity.Tok1uriaId;
import com.example.tokaiapp.service.Tok1uriaService;

@RestController
@RequestMapping("/tkapi/tok1uria")
public class Tok1uriaController {

    private final Tok1uriaService tok1uriaService;

    public Tok1uriaController(Tok1uriaService tok1uriaService) {
        this.tok1uriaService = tok1uriaService;
    }

    @GetMapping
    public List<Tok1uria> findAll() {
        return tok1uriaService.findAll();
    }

    @GetMapping("/{jyuJiCd}/{anNo}/{buNo}/{urNo}")
    public ResponseEntity<Tok1uria> findById(
            @PathVariable String jyuJiCd,
            @PathVariable String anNo,
            @PathVariable String buNo,
            @PathVariable String urNo) {
        Tok1uriaId id = new Tok1uriaId(jyuJiCd, anNo, buNo, urNo);
        return tok1uriaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tok1uria save(@RequestBody Tok1uria tok1uria) {
        return tok1uriaService.save(tok1uria);
    }
}
