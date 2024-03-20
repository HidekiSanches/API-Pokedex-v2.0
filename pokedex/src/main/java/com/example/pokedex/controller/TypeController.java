package com.example.pokedex.controller;

import com.example.pokedex.domain.dto.DadosTypeCompleto;
import com.example.pokedex.domain.service.TypeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/types")
public class TypeController {
    private final TypeService typeService;

    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }

    @GetMapping
    public ResponseEntity<List<DadosTypeCompleto>> findAll() {
        List<DadosTypeCompleto> dto = typeService.findAll();

        return dto.isEmpty()
                ? ResponseEntity.status(204).build()
                : ResponseEntity.status(200).body(dto);
    }

    @GetMapping("/{type}")
    public ResponseEntity<List<DadosTypeCompleto>> findAllByType(@PathVariable String type) {
        List<DadosTypeCompleto> dto = typeService.findAllByType(type);

        return dto.isEmpty()
                ? ResponseEntity.status(204).build()
                : ResponseEntity.status(200).body(dto);
    }
}
