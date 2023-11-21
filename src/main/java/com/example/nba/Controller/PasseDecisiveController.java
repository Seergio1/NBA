package com.example.nba.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.nba.Models.PasseDecisive;
import com.example.nba.Service.PasseDecisiveService;

import lombok.Getter;

@RestController
@Getter
public class PasseDecisiveController {

  @Autowired
  PasseDecisiveService passeDecisiveService;

  @PostMapping(path = "/passe-decisive/save", produces = "application/json",consumes = "application/json")
  public PasseDecisive save(@RequestBody PasseDecisive passeDecisive) {
    return this.getPasseDecisiveService().save(passeDecisive);
  }

}
