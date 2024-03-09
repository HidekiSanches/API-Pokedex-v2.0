package com.example.pokedex.domain.repository;

import com.example.pokedex.domain.model.NatureModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NatureRepository extends JpaRepository<NatureModel, UUID> {
}
