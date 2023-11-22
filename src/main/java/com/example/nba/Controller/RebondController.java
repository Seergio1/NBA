package com.example.nba.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.nba.Models.I_Rebond;
import com.example.nba.Models.MatchEffectif;
import com.example.nba.Models.Rebond;
import com.example.nba.Service.RebondService;

import lombok.Getter;

@RestController
@Getter
public class RebondController {

  @Autowired
  RebondService rebondService;

  @PostMapping(path = "/rebond/save", produces = "application/json")
  public Rebond save(@RequestBody I_Rebond rebond) {

    Rebond rebond2 = Rebond.builder()
        .matchEffectif(MatchEffectif.builder().id(rebond.getMatchEffectif().getId()).build()).minute(rebond.getMinute())
        .seconde(rebond.getSeconde()).build();

    return this.getRebondService().save(rebond2);
  }

}
