package com.example.nba.Models;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "passe_decisive")
@Table(name = "passe_decisive")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PasseDecisive {

  @Id
  @SequenceGenerator(name = "passe_decisive_sequence", sequenceName = "passe_decisive_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passe_decisive_sequence")
  @Column(name = "id_passe_decisive", updatable = false)
  Long id;

  @ManyToOne(cascade = CascadeType.MERGE)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JoinColumn(name = "id_match", unique = false)
  @JsonBackReference
  MatchEffectif matchEffectif;

  @Column(name = "minute", columnDefinition = "INTEGER")
  Integer minute;

  @Column(name = "seconde", columnDefinition = "INTEGER")
  Integer seconde;

}