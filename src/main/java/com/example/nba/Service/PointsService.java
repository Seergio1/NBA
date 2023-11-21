package com.example.nba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nba.Models.Points;
import com.example.nba.Repository.PointsRepository;

import lombok.Getter;

@Service
@Getter
public class PointsService {

  @Autowired
  PointsRepository pointsRepository;

  public Points save(Points points) {
    return this.getPointsRepository().save(points);
  }

}
