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

@Entity(name = "rebons")
@Table(name = "rebons")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rebond {

  @Id
  @SequenceGenerator(name = "rebons_sequence", sequenceName = "rebons_sequence", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rebons_sequence")
  @Column(name = "id", updatable = false)
  Long id;

  @ManyToOne(cascade = CascadeType.MERGE)
  @OnDelete(action = OnDeleteAction.CASCADE)
  @JsonBackReference
  @JoinColumn(name = "id_match", unique = false)
  MatchEffectif matchEffectif;

  @Column(name = "minute", columnDefinition = "INTEGER")
  Integer minute;

  @Column(name = "seconde", columnDefinition = "INTEGER")
  Integer seconde;

}
