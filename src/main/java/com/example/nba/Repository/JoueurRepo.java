package com.example.nba.Repository;

import org.springframework.stereotype.Repository;

import com.example.nba.Models.Joueur;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface JoueurRepo extends JpaRepository<Joueur,Long>{
    @Query("SELECT j FROM joueur j WHERE j.equipe.id = :idE")
    List<Joueur> getJoueurById(@Param("idE") long id_equipe);
}
