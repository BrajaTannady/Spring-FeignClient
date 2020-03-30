package com.example.SpringFeignClient.client;

import com.example.SpringFeignClient.entity.People;
import com.example.SpringFeignClient.entity.Planet;
import com.example.SpringFeignClient.entity.Starship;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "SwapiClient", url = "https://swapi.co/api",fallback = FallbackSwapi.class)
public interface SwapiClient {

  @GetMapping("/people/{id}")
  public People getPeopleById(@PathVariable Long id);

  @GetMapping("/planets/{id}")
  public Planet getPlanetsById(@PathVariable Long id);

  @GetMapping("/starships/{id}")
  public Starship getStarshipsById(@PathVariable Long id);
}
