package com.example.SpringFeignClient.client;

import com.example.SpringFeignClient.entity.People;
import com.example.SpringFeignClient.entity.Planet;
import com.example.SpringFeignClient.entity.Starship;
import org.springframework.stereotype.Component;

@Component
public class FallbackSwapi implements SwapiClient {
  @Override
  public People getPeopleById(Long id) {
    return People.builder().name("Default").build();
  }

  @Override
  public Planet getPlanetsById(Long id) {
    return Planet.builder().build();
  }

  @Override
  public Starship getStarshipsById(Long id) {
    return Starship.builder().build();
  }
}
