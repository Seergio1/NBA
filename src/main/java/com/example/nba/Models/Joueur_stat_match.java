package com.example.nba.Models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "joueur_stat_match")
@Table(name = "joueur_stat_match")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Joueur_stat_match {
    @jakarta.persistence.Id
    @SequenceGenerator(
        name = "joueur_stat_match_sequence",
        sequenceName = "joueur_stat_match_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "joueur_stat_match_sequence"
    )
    @Column(name = "id", updatable = false)
    Long id;

    @ManyToOne(cascade = CascadeType.MERGE)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_joueur" ,unique = false)
    Joueur joueur;

    @ManyToOne(cascade = CascadeType.MERGE)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_match" ,unique = false)
    Match match;

    @Column(name = "points")
    double points;

    @Column(name = "rebond")
    double rebond;

    @Column(name = "passe_D")
    double passe_D;

    @Column(name = "trois_points_marques")
    double trois_points_marques;

    @Column(name = "trois_points_tires")
    double trois_points_tires;

    @Column(name = "lancer_front_tires")
    double lancer_front_tires;

    @Column(name = "lancer_front_marques")
    double lancer_front_marques;

    @Column(name = "minutes")
    String minutes;





}
