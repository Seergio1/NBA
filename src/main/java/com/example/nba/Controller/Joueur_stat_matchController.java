package com.example.nba.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nba.Models.Joueur_stat_match;
import com.example.nba.Service.Joueur_stat_matchService;

@RestController
@RequestMapping(path = "joueur_stat_match")
public class Joueur_stat_matchController {
    @Autowired
    Joueur_stat_matchService joueur_stat_matchService;

    @GetMapping(path = "/allStat")
    public List<Joueur_stat_match> getAllStat(){
        return joueur_stat_matchService.getAllStat();
    }
}
