package com.example.tokaiapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.tokaiapp.entity.Tmk1tkui;
import com.example.tokaiapp.repository.Tmk1tkuiRepository;

@Service
public class Tmk1tkuiService {

    private final Tmk1tkuiRepository tmk1tkuiRepository;

    public Tmk1tkuiService(Tmk1tkuiRepository tmk1tkuiRepository) {
        this.tmk1tkuiRepository = tmk1tkuiRepository;
    }

    public List<Tmk1tkui> findAll() {
        return tmk1tkuiRepository.findAll();
    }

    public Optional<Tmk1tkui> findById(String tkCd) {
        return tmk1tkuiRepository.findById(tkCd);
    }

    public Tmk1tkui save(Tmk1tkui tmk1tkui) {
        return tmk1tkuiRepository.save(tmk1tkui);
    }
}
