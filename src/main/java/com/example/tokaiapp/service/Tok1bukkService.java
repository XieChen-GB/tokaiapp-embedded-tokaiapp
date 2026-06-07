package com.example.tokaiapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.tokaiapp.entity.Tok1bukk;
import com.example.tokaiapp.entity.Tok1bukkId;
import com.example.tokaiapp.repository.Tok1bukkRepository;

@Service
public class Tok1bukkService {

    private final Tok1bukkRepository tok1bukkRepository;

    public Tok1bukkService(Tok1bukkRepository tok1bukkRepository) {
        this.tok1bukkRepository = tok1bukkRepository;
    }

    public List<Tok1bukk> findAll() {
        return tok1bukkRepository.findAll();
    }

    public Optional<Tok1bukk> findById(Tok1bukkId id) {
        return tok1bukkRepository.findById(id);
    }

    public Tok1bukk save(Tok1bukk tok1bukk) {
        return tok1bukkRepository.save(tok1bukk);
    }
}
