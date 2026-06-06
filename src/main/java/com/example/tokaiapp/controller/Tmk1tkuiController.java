package com.example.tokaiapp.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tokaiapp.entity.Tmk1tkui;
import com.example.tokaiapp.service.Tmk1tkuiService;

@RestController
@RequestMapping("/tkapi/tmk1tkui")
public class Tmk1tkuiController {

    private final Tmk1tkuiService tmk1tkuiService;

    public Tmk1tkuiController(Tmk1tkuiService tmk1tkuiService) {
        this.tmk1tkuiService = tmk1tkuiService;
    }

    @GetMapping
    public List<Tmk1tkui> findAll() {
        return tmk1tkuiService.findAll();
    }

    @GetMapping("/{tkCd}")
    public ResponseEntity<Tmk1tkui> findById(@PathVariable String tkCd) {
        return tmk1tkuiService.findById(tkCd)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Tmk1tkui save(@RequestBody Tmk1tkui tmk1tkui) {
        return tmk1tkuiService.save(tmk1tkui);
    }
}
