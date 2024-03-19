package com.example.pokedex.controller;

import com.example.pokedex.domain.dto.DadosPokemonCompleto;
import com.example.pokedex.domain.service.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping
    public ResponseEntity<List<DadosPokemonCompleto>> findAll() {
        return null;
    }

    @GetMapping("/{searchTerm}")
    public ResponseEntity<List<DadosPokemonCompleto>> findAllByNameOrType(@PathVariable String searchTerm) {
        return null;
    }
}
