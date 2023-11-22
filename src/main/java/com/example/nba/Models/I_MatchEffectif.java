package com.example.nba.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class I_MatchEffectif {

    Long id;

    I_Match match;

    I_Joueur joueur;

    public Joueur getJoueur() {
        return Joueur.builder().id(this.joueur.id).build();
    }

    public Match getMatch() {
        return Match.builder().id(this.match.id).build();
    }
}
