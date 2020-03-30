package com.example.SpringFeignClient.controller;

import com.example.SpringFeignClient.client.SwapiClient;
import com.example.SpringFeignClient.entity.People;
import com.example.SpringFeignClient.entity.Planet;
import com.example.SpringFeignClient.entity.Starship;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

class ClientControllerTest {
  @Autowired
  SwapiClient swapiClient;
  @Autowired
  private MockMvc mockMvc;

  @Test
  void getPeople() throws Exception {
    Long id = Long.valueOf(1);
    People people = People.builder()
        .name("Test").build();
    when(swapiClient.getPeopleById(id)).thenReturn(people);
    mockMvc.perform(get("/people/{id}", id))
        .andExpect(status().isOk())
        .andExpect(view().name("test"));
  }

  @Test
  void getPlanets() throws Exception {
    Long id = Long.valueOf(1);
    Planet planet = Planet.builder()
        .name("Test").build();
    when(swapiClient.getPlanetsById(id)).thenReturn(planet);
    mockMvc.perform(get("/planets/{id}", id))
        .andExpect(status().isOk())
        .andExpect(view().name("test"));
  }

  @Test
  void getStarships() throws Exception {
    Long id = Long.valueOf(1);
    Starship starship = Starship.builder()
        .name("Test").build();
    when(swapiClient.getStarshipsById(id)).thenReturn(starship);
    mockMvc.perform(get("/starships/{id}"))
        .andExpect(status().isOk())
        .andExpect(view().name("test"));
  }
}