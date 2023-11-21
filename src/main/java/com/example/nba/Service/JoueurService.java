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

    public List<Joueur> getAllJoueur() {
        return joueurRepo.findAll();
    }

    public List<Joueur> getJoueurByIdEquipe(long id_equipe) {
        List<Joueur> joueur = joueurRepo.getJoueurById(id_equipe);
        // List<Joueur_stat_match> stats = new Vector<Joueur_stat_match>();
        // for (int index = 0; index < joueur.size(); index++) {

        // }
        return null;
    }

}
