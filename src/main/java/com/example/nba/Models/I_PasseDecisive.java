package com.example.nba.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class I_PasseDecisive {

    Long id;

    I_MatchEffectif matchEffectif;

    Integer minute;

    Integer seconde;
}
