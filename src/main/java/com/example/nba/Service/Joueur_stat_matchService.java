package com.example.nba.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nba.Models.Joueur_stat_match;
import com.example.nba.Repository.Joueur_stat_matchRepo;

@Service
public class Joueur_stat_matchService {
    @Autowired
    Joueur_stat_matchRepo joueur_stat_matchRepo;

    public List<Joueur_stat_match> getAllStat(){
        return joueur_stat_matchRepo.findAll();
    }
}
