package com.example.nba.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nba.Models.Joueur;
import com.example.nba.Repository.JoueurRepo;

@Service
public class JoueurService {
    @Autowired
    JoueurRepo joueurRepo;

    public List<Joueur> getAllJoueur(){
        return joueurRepo.findAll();
    }
}
