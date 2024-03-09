package com.example.pokedex.domain.repository;

import com.example.pokedex.domain.model.MoveModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MoveRepository extends JpaRepository<MoveModel, UUID> {
}
