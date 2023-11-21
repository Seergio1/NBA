package com.example.nba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nba.Models.PasseDecisive;
import com.example.nba.Repository.PasseDecisiveRepository;

import lombok.Getter;

@Service
@Getter
public class PasseDecisiveService {

  @Autowired
  PasseDecisiveRepository passeDecisiveRepository;

  public PasseDecisive save(PasseDecisive passeDecisive) {
    return this.getPasseDecisiveRepository().save(passeDecisive);
  }

}
