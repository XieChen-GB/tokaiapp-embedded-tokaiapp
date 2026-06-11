package com.example.tokaiapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.tokaiapp.entity.Tok1uria;
import com.example.tokaiapp.entity.Tok1uriaId;
import com.example.tokaiapp.repository.Tok1uriaRepository;

@Service
public class Tok1uriaService {

    private final Tok1uriaRepository tok1uriaRepository;

    public Tok1uriaService(Tok1uriaRepository tok1uriaRepository) {
        this.tok1uriaRepository = tok1uriaRepository;
    }

    public List<Tok1uria> findAll() {
        return tok1uriaRepository.findAll();
    }

    public Optional<Tok1uria> findById(Tok1uriaId id) {
        return tok1uriaRepository.findById(id);
    }

    public Tok1uria save(Tok1uria tok1uria) {
        return tok1uriaRepository.save(tok1uria);
    }
}
