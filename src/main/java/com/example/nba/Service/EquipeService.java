package com.example.nba.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nba.Models.Equipe;
import com.example.nba.Models.Joueur;
import com.example.nba.Repository.EquipeRepo;

import lombok.Getter;

@Service
@Getter
public class EquipeService {
    @Autowired
    EquipeRepo equipeRepo;

    public List<Equipe> getAllEquipes() {
        return equipeRepo.findAll();
    }

    public Equipe findById(Long id) {
        Equipe equipe = this.getEquipeRepo().findById(id).orElse(null);
        if (equipe != null) {
            for (Joueur joueur : equipe.getJoueurs()) {
                joueur.setStats();
            }
        }
        return equipe;
    }

}
