package com.example.nba.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nba.Models.Joueur;
import com.example.nba.Service.JoueurService;

@RestController
@RequestMapping(path = "joueur")
public class JoueurController {
    @Autowired
    JoueurService joueurService;

    @GetMapping(path = "/allJoueur")
    public List<Joueur> getAllJoueur() {
        List<Joueur> joueurs = joueurService.getAllJoueur();
        for (Joueur joueur : joueurs) {
            joueur.setStats();
        }
        return joueurs;
    }
}
