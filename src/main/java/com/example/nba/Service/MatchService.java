package com.example.nba.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nba.Models.Match;
import com.example.nba.Repository.MatchRepo;

@Service
public class MatchService {
    @Autowired
    MatchRepo matchRepo;

    public List<Match> getAllMatch(){
        return matchRepo.findAll();
    }
}
