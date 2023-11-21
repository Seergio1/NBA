package com.example.nba.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nba.Models.Equipe;
import com.example.nba.Service.EquipeService;

@RestController
@RequestMapping(path = "equipe")
public class EquipeController {
    @Autowired
    EquipeService equipeService;

    @GetMapping(path = "/allEquipe")
    public List<Equipe> getAllEquipes() {
        return equipeService.getAllEquipes();
    }

    @GetMapping(path = "/{id}", produces = "application/json")
    public Equipe findById(@PathVariable("id") Long id) {
        return equipeService.findById(id);
    }
}
