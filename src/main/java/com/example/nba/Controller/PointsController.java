package com.example.nba.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.nba.Models.I_Points;
import com.example.nba.Models.MatchEffectif;
import com.example.nba.Models.Points;
import com.example.nba.Service.PointsService;

import lombok.Getter;

@RestController
@Getter
public class PointsController {

  @Autowired
  PointsService pointsService;

  @PostMapping(path = "/points/save", produces = "application/json")
  public Points save(@RequestBody I_Points points) {

    Points points2 = Points.builder()
        .matchEffectif(MatchEffectif.builder().id(points.getMatchEffectif().getId()).build()).minute(points.getMinute())
        .seconde(points.getSeconde()).points(points.getPoints()).build();

    return this.getPointsService().save(points2);
  }

}
