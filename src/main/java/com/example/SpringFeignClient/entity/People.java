package com.example.SpringFeignClient.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class People {
  String name;
  String height;
  String mass;
  String hair_color;
  String skin_color;
  String eye_color;
  String birth_year;
  String gender;
  String homeworld;
  List<String> films;
  List<String> species;
  List<String> vehicles;
  List<String> starships;
  String created;
  String edited;
  String url;
}
