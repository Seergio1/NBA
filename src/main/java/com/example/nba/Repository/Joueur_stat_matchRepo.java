package com.example.nba.Repository;

import org.springframework.stereotype.Repository;

import com.example.nba.Models.Joueur_stat_match;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface Joueur_stat_matchRepo extends JpaRepository<Joueur_stat_match,Long>{
    
}
