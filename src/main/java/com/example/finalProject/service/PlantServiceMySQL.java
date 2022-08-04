package com.example.finalProject.service;

import com.example.finalProject.repository.Plant;
import com.example.finalProject.repository.PlantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlantServiceMySQL implements PlantService
{
    private final PlantRepo plantRepo;

    public PlantServiceMySQL(@Autowired PlantRepo plantRepo )
    {
        this.plantRepo = plantRepo;
    }

    @Override
    public Plant save(Plant plant )
    {
        plantRepo.save(plant);
        return plant;
    }


    @Override
    public void delete( Integer plantId )
    {
        plantRepo.deleteById(plantId);
    }

    @Override
    public List<Plant> all()
    {
       return plantRepo.findAll();
    }

    @Override
    public Plant findById(Integer plantId )
    {
       return null;
    }
}
