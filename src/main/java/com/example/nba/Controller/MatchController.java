package com.example.nba.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nba.Models.Equipe;
import com.example.nba.Models.I_Match;
import com.example.nba.Models.Match;
import com.example.nba.Repository.MatchRepo;
import com.example.nba.Service.MatchService;

@RestController
@RequestMapping(path = "match")
public class MatchController {
    @Autowired
    MatchService matchService;

    @Autowired
    MatchRepo matchRepo;

    @GetMapping(path = "/allMatch")
    public List<Match> getAllMatch() {
        return matchService.getAllMatch();
    }

    @PostMapping(path = "/save")
    public Match save(@RequestBody I_Match i_Match) {

        Match match = Match.builder().equipeDomicile(i_Match.toEquipe(i_Match.getEquipeDomicile()))
                .equipeExterieur(i_Match.toEquipe(i_Match.getEquipeExterieur())).build();
        return this.matchRepo.save(match);
    }
}
