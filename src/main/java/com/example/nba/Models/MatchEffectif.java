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
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "match_effectif")
@Table(name = "match_effectif")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatchEffectif {

  @Id
  @SequenceGenerator(name = "match_effectif_sequence", sequenceName = "match_effectif_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "match_effectif_sequence")
  @Column(name = "id", updatable = false)
  Long id;

  @ManyToOne(cascade = CascadeType.MERGE)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JsonBackReference
  @JoinColumn(name = "id_match", unique = false)
  Match match;

  @ManyToOne(cascade = CascadeType.MERGE)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JsonBackReference
  @JoinColumn(name = "id_joueur", unique = false)
  Joueur joueur;

  @OneToMany(mappedBy = "matchEffectif")
  @Builder.Default
  @JsonManagedReference
  List<Rebond> rebonds = new ArrayList<>();

  @OneToMany(mappedBy = "matchEffectif")
  @Builder.Default
  @JsonManagedReference
  List<PasseDecisive> passeDecisives = new ArrayList<>();

  @OneToMany(mappedBy = "matchEffectif")
  @Builder.Default
  @JsonManagedReference
  List<Points> points = new ArrayList<>();

}
