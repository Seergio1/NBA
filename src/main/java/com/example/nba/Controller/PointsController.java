package com.example.nba.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.nba.Models.Points;
import com.example.nba.Service.PointsService;

import lombok.Getter;

@RestController
@Getter
public class PointsController {

  @Autowired
  PointsService pointsService;

  @PostMapping(path = "/points/save", produces = "application/json")
  public Points save(@RequestBody Points points) {
    return this.getPointsService().save(points);
  }

}
