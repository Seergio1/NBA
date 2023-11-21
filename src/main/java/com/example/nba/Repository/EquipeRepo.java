package com.example.nba.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.nba.Models.Equipe;

@Repository
public interface EquipeRepo extends JpaRepository<Equipe,Long>{
    
}
