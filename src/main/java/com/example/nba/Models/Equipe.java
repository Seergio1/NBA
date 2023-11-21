package com.example.nba.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "equipe")
@Table(name = "equipe")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Equipe {
    @jakarta.persistence.Id
    @SequenceGenerator(
        name = "equipe_sequence",
        sequenceName = "equipe_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "equipe_sequence"
    )
    @Column(name = "id", updatable = false)
    Long id;
    
    @Column(name = "nom")
    String nom;

    @Column(name = "abreviation")
    String abreviation;

    @Column(name = "pathPhoto")
    String pathPhoto;
}
