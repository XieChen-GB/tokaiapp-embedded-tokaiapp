package com.example.tokaiapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.tokaiapp.entity.Tok1ankk;
import com.example.tokaiapp.entity.Tok1ankkId;
import com.example.tokaiapp.repository.Tok1ankkRepository;

@Service
public class Tok1ankkService {

    private final Tok1ankkRepository tok1ankkRepository;

    public Tok1ankkService(Tok1ankkRepository tok1ankkRepository){
        this.tok1ankkRepository = tok1ankkRepository;
    }
    
    public List<Tok1ankk> findAll(){
        return tok1ankkRepository.findAll();
    }

    public Optional<Tok1ankk> findById(Tok1ankkId id){
        return tok1ankkRepository.findById(id);
    }

    public Tok1ankk save(Tok1ankk tok1ankk){
        return tok1ankkRepository.save(tok1ankk);
    }
}
