package com.example.nba.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.nba.Models.Rebond;
import com.example.nba.Service.RebondService;

import lombok.Getter;

@RestController
@Getter
public class RebondController {

  @Autowired
  RebondService rebondService;

  @PostMapping(path = "/rebond/save", produces = "application/json",consumes = "application/json")
  public Rebond save(@RequestBody Rebond rebond) {
    return this.getRebondService().save(rebond);
  }

}
