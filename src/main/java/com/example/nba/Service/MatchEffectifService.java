package com.example.nba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nba.Models.MatchEffectif;
import com.example.nba.Repository.MatchEffectifRepo;

import lombok.Getter;

@Service
@Getter
public class MatchEffectifService {

  @Autowired
  MatchEffectifRepo matchEffectifRepo;

  public MatchEffectif save(MatchEffectif matchEffectif) {
    return this.getMatchEffectifRepo().save(matchEffectif);
  }

  }

