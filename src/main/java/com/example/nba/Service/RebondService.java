package com.example.nba.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nba.Models.Rebond;
import com.example.nba.Repository.RebondRepository;

import lombok.Getter;

@Service
@Getter
public class RebondService {

  @Autowired
  RebondRepository rebondRepository;

  public Rebond save(Rebond rebond) {
    return this.getRebondRepository().save(rebond);
  }

}
