package com.example.finalProject.controller;

import com.example.finalProject.controller.dto.PlantDto;
import com.example.finalProject.repository.Plant;
import com.example.finalProject.repository.PlantRepo;
import com.example.finalProject.service.PlantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/plant")
public class MainController{

    final PlantService plantService;


    public MainController(@Autowired PlantService plantService )
    {
        this.plantService = plantService;
    }

    @GetMapping("/all")
    public Iterable<Plant> getPlants(){
        return plantService.all();
    }

    @PostMapping
    public Plant save (@RequestBody PlantDto plantDto){
        return plantService.save( new Plant(plantDto));
    }

    @GetMapping("/{id}")
    public Plant getPlantById(@PathVariable Integer id){
        return plantService.findById(id);
    }

    @PutMapping("/{id}")
    public Plant update(@RequestBody PlantDto plantDto, @PathVariable Integer id) {
        Plant plant = plantService.findById(id);
        plant.setName(plant.getName());
        plant.setDescription(plant.getDescription());
        plant.setImageUrl(plant.getImageUrl());
        return plantService.save(plant);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        plantService.delete(id);
    }
}
