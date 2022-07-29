package com.example.finalProject.service;

import com.example.finalProject.repository.Plant;

import java.util.List;
import java.util.Optional;

public interface PlantService {
    Plant save(Plant plant );

    boolean delete( int plantId );

    List<Plant> all();

    Plant findById(int plantId );
}
