package com.example.nba.Models;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "joueur")
@Table(name = "joueur")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Joueur {

    @jakarta.persistence.Id
    @SequenceGenerator(name = "joueur_sequence", sequenceName = "joueur_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "joueur_sequence")
    @Column(name = "id", updatable = false)
    Long id;

    @Column(name = "nom")
    String nom;

    @Column(name = "prenom")
    String prenom;

    @ManyToOne(cascade = CascadeType.MERGE)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonBackReference
    @JoinColumn(name = "id_equipe", unique = false)
    Equipe equipe;

    @Column(name = "pathPhoto")
    String pathPhoto;

    @OneToMany(mappedBy = "joueur")
    @Builder.Default
    @JsonManagedReference
    List<MatchEffectif> matchEffectifs = new ArrayList<>();

    @Transient
    @Builder.Default
    Integer nombreMatch = 0;

    @Transient
    @Builder.Default
    Integer pointParMatch = 0;

    @Transient
    @Builder.Default
    Integer rebondParMatch = 0;

    @Transient
    @Builder.Default
    Integer passeDecisiveParMatch = 0;

    public void setStats() {
        this.nombreMatch = this.getMatchEffectifs().size();
        int totalPoints = 0;
        int totalRebond = 0;
        int totalPd = 0;
        for (MatchEffectif matchEffectif : this.getMatchEffectifs()) {
            for (Points points : matchEffectif.getPoints()) {
                totalPoints += points.getPoints();
            }
            totalRebond += matchEffectif.getRebonds().size();
            System.out.println("Total rebond: " + totalRebond);
            totalPd += matchEffectif.getPasseDecisives().size();
        }
        try {
            this.pointParMatch = totalPoints / nombreMatch;
            this.rebondParMatch = totalRebond / nombreMatch;
            this.passeDecisiveParMatch = totalPd / nombreMatch;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
