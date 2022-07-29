package com.example.finalProject.repository;

import com.example.finalProject.repository.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called itemRepository
// CRUD refers Create, Read, Update, Delete
public interface PlantRepo extends JpaRepository<Plant, Integer> {
}