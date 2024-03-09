package com.example.pokedex.domain.repository;

import com.example.pokedex.domain.model.AbilityModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AbilityRepository extends JpaRepository<AbilityModel, UUID> {
}
