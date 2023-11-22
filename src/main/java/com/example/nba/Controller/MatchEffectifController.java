package com.example.nba.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.nba.Models.I_MatchEffectif;
import com.example.nba.Models.MatchEffectif;
import com.example.nba.Service.MatchEffectifService;

import lombok.Getter;

@RestController
@Getter
public class MatchEffectifController {

  @Autowired
  MatchEffectifService matchEffectifService;

  @PostMapping(path = "/match-effect/save", produces = "application/json")
  public MatchEffectif save(@RequestBody I_MatchEffectif matchEffectif) {

    MatchEffectif m = MatchEffectif.builder().joueur(matchEffectif.getJoueur()).match(matchEffectif.getMatch()).build();

    return this.getMatchEffectifService().save(m);
  }

}
