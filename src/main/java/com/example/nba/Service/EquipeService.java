package com.example.nba.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nba.Models.Equipe;
import com.example.nba.Repository.EquipeRepo;

@Service
public class EquipeService {
    @Autowired
    EquipeRepo equipeRepo;

    public List<Equipe> getAllEquipes(){
        return equipeRepo.findAll();
    }
}
