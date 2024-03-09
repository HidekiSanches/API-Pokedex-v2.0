package com.example.pokedex.domain.repository;

import com.example.pokedex.domain.model.TypeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TypeRepository extends JpaRepository<TypeModel, UUID> {
}
