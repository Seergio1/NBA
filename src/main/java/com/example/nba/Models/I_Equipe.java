package com.example.nba.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class I_Equipe {

    Long id;

    String nom;

    String abreviation;

    String pathPhoto;
}
