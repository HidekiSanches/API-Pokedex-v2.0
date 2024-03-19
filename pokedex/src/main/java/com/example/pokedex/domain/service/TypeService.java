package com.example.pokedex.domain.service;

import com.example.pokedex.domain.dto.DadosTypeCompleto;
import com.example.pokedex.domain.model.TypeModel;
import com.example.pokedex.domain.repository.TypeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TypeService {
    private final TypeRepository typeRepository;

    public TypeService(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    public List<DadosTypeCompleto> findAll() {
        List<TypeModel> listType = typeRepository.findAll();
        List<DadosTypeCompleto> dtoType = new ArrayList<>();

        for (TypeModel type : listType) {
            dtoType.add(mapToDadosTypeCompleto(type));
        }

        return dtoType;
    }

    private DadosTypeCompleto mapToDadosTypeCompleto(TypeModel type) {
        DadosTypeCompleto dto = new DadosTypeCompleto();
        dto.setId(type.getTypeId());
        dto.setType1(type.getType1());
        dto.setType2(type.getType2());
        return dto;
    }
}
