package com.example.tokaiapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tokaiapp.entity.Tok1meis;
import com.example.tokaiapp.entity.Tok1meisId;

public interface Tok1meisRepository extends JpaRepository<Tok1meis, Tok1meisId> {
}
