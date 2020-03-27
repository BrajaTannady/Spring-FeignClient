package com.example.SpringFeignClient.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Planet {
  String name;
  String diameter;
  String rotation_period;
  String orbital_period;
  String gravity;
  String population;
  String climate;
  String terrain;
  String surface_water;
  List<String> residents;
  List<String> films;
  String url;
  String created;
  String edited;
}
