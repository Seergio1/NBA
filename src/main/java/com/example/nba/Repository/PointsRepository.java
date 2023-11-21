package com.example.nba.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nba.Models.Points;

public interface PointsRepository extends JpaRepository<Points, Long> {

}
