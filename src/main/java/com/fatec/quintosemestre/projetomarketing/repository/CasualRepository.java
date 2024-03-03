package com.fatec.quintosemestre.projetomarketing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.quintosemestre.projetomarketing.model.Casual;

@Repository
public interface CasualRepository extends JpaRepository<Casual, Long> {
    
}
