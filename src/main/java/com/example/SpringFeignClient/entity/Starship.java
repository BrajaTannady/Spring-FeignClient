package com.example.SpringFeignClient.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Starship {
  String name;
  String model;
  String starship_class;
  String manufacturer;
  String cost_in_credits;
  String length;
  String crew;
  String passengers;
  String max_atmosphering_speed;
  String hyperdrive_rating;
  String MGLT;
  String cargo_capacity;
  String consumables;
  List<String> array;
  List<String> pilots;
  String url;
  String created;
  String edited;
}
