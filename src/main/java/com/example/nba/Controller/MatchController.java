package com.example.nba.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nba.Models.Match;
import com.example.nba.Service.MatchService;

@RestController
@RequestMapping(path = "match")
public class MatchController {
    @Autowired
    MatchService matchService;

    @GetMapping(path = "/allMatch")
    public List<Match> getAllMatch(){
        return matchService.getAllMatch();
    }
}
