package com.example.SpringFeignClient.client;

import com.example.SpringFeignClient.entity.People;
import com.example.SpringFeignClient.entity.Planet;
import com.example.SpringFeignClient.entity.Starship;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
class SwapiClientTest {
  @Autowired
  SwapiClient swapiClient;

  @Test
  void getPeopleById() {
    Long id = Long.valueOf(1);
    People people = People.builder()
        .name("test").build();
    when(swapiClient.getPeopleById(id)).thenReturn(people);
    assertEquals("test", people.getName());
    verify(swapiClient).getPeopleById(id);
  }

  @Test
  void getPlanetsById() {
    Long id = Long.valueOf(1);
    Planet planet = Planet.builder()
        .name("test").build();
    when(swapiClient.getPlanetsById(id)).thenReturn(planet);
    assertEquals("test", planet.getName());
    verify(swapiClient).getPlanetsById(id);
  }

  @Test
  void getStarshipsById() {
    Long id = Long.valueOf(1);
    Starship starship = Starship.builder()
        .name("test").build();
    when(swapiClient.getStarshipsById(id)).thenReturn(starship);
    assertEquals("test", starship.getName());
    verify(swapiClient).getStarshipsById(id);
  }
}