package com.example.nba.Repository;

import org.springframework.stereotype.Repository;

import com.example.nba.Models.Match;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MatchRepo extends JpaRepository<Match,Long>{
    
}
