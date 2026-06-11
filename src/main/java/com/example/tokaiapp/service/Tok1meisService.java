package com.example.tokaiapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.tokaiapp.entity.Tok1meis;
import com.example.tokaiapp.entity.Tok1meisId;
import com.example.tokaiapp.repository.Tok1meisRepository;

@Service
public class Tok1meisService {

    private final Tok1meisRepository tok1meisRepository;

    public Tok1meisService(Tok1meisRepository tok1meisRepository) {
        this.tok1meisRepository = tok1meisRepository;
    }

    public List<Tok1meis> findAll() {
        return tok1meisRepository.findAll();
    }

    public Optional<Tok1meis> findById(Tok1meisId id) {
        return tok1meisRepository.findById(id);
    }

    public Tok1meis save(Tok1meis tok1meis) {
        return tok1meisRepository.save(tok1meis);
    }
}
