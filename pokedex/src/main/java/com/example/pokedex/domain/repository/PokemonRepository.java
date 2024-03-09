package com.example.pokedex.domain.repository;

import com.example.pokedex.domain.model.PokemonModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PokemonRepository extends JpaRepository<PokemonModel, UUID> {
}
