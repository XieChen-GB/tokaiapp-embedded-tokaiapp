package com.example.tokaiapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.tokaiapp.entity.Tmk6jyou;
import com.example.tokaiapp.repository.Tmk6jyouRepository;

@Service
public class Tmk6jyouService {

    private final Tmk6jyouRepository tmk6jyouRepository;

    public Tmk6jyouService(Tmk6jyouRepository tmk6jyouRepository) {
        this.tmk6jyouRepository = tmk6jyouRepository;
    }

    public List<Tmk6jyou> findAll() {
        return tmk6jyouRepository.findAll();
    }

    public Optional<Tmk6jyou> findById(String jiCd) {
        return tmk6jyouRepository.findById(jiCd);
    }

    public Tmk6jyou save(Tmk6jyou tmk6jyou) {
        return tmk6jyouRepository.save(tmk6jyou);
    }
}
