package com.example.nba.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.nba.Models.MatchEffectif;
import com.example.nba.Service.MatchEffectifService;

import lombok.Getter;

@RestController
@Getter
public class MatchEffectifController {

  @Autowired
  MatchEffectifService matchEffectifService;

  @PostMapping(path = "/match-effect/save",consumes = "application/json", produces = "application/json")
  public MatchEffectif save(@RequestBody MatchEffectif matchEffectif) {
    return this.getMatchEffectifService().save(matchEffectif);
  }

}
