package com.example.nba.Repository;

import org.springframework.stereotype.Repository;

import com.example.nba.Models.Joueur;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface JoueurRepo extends JpaRepository<Joueur,Long>{
    
}
