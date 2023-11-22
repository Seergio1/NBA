package com.example.nba.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class I_Match {

  Long id;
  I_Equipe equipeDomicile;
  I_Equipe equipeExterieur;

  public Equipe toEquipe(I_Equipe equipe) {
    Equipe equipe__ = Equipe.builder().id(equipe.getId()).build();
    return equipe__;
  }
}
