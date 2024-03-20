package com.example.pokedex.domain.repository;

import com.example.pokedex.domain.model.TypeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface TypeRepository extends JpaRepository<TypeModel, UUID> {
    List<TypeModel> findAllByType1ContainingOrType2Containing(String type1, String type2);
}
