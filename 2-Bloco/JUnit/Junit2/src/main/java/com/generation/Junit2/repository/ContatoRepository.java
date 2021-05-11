package com.generation.Junit2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.Junit2.model.ContatoModel;

@Repository
public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}
