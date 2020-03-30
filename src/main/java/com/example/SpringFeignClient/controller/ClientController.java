package com.example.SpringFeignClient.controller;

import com.example.SpringFeignClient.client.SwapiClient;
import com.example.SpringFeignClient.entity.People;
import com.example.SpringFeignClient.entity.Planet;
import com.example.SpringFeignClient.entity.Starship;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {
  @Autowired
  SwapiClient swapiClient;

  @GetMapping("/people/{id}")
  public People getPeople(@PathVariable Long id) {
    return swapiClient.getPeopleById(id);
  }

  @GetMapping("/planets/{id}")
  public Planet getPlanets(@PathVariable Long id) {
    return swapiClient.getPlanetsById(id);
  }

  @GetMapping("/starships/{id}")
  public Starship getStarships(@PathVariable Long id) {
    return swapiClient.getStarshipsById(id);
  }
}
