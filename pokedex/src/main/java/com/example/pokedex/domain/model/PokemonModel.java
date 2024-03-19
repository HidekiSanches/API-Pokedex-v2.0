package com.example.pokedex.domain.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "pokemon")
public class PokemonModel {
    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "pokemon_id", length = 36, columnDefinition = "uuid")
    private UUID pokemonId;
    @Column(name = "no_pokedex", length = 50, nullable = false)
    private int noPokedex;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "type_fk", referencedColumnName = "type_id")
    private TypeModel types;
    @Column(name = "description", length = 200, nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn(name = "ability_fk", referencedColumnName = "ability_id")
    private AbilityModel ability;
    @ManyToOne
    @JoinColumn(name = "nature_fk", referencedColumnName = "nature_id")
    private NatureModel nature;
    @OneToOne
    @JoinColumn(name = "stats_fk")
    private StatsModel stats;
    @ManyToMany
    @JoinTable(
            name = "Pokemon_Move",
            joinColumns = @JoinColumn(name = "pokemon_id"),
            inverseJoinColumns = @JoinColumn(name = "move_id")
    )
    private List<MoveModel> moves;

    public PokemonModel() {
    }

    public PokemonModel(UUID pokemonId, int noPokedex, String name, TypeModel types, String description, AbilityModel ability, NatureModel nature, List<MoveModel> moves) {
        this.pokemonId = pokemonId;
        this.noPokedex = noPokedex;
        this.name = name;
        this.types = types;
        this.description = description;
        this.ability = ability;
        this.nature = nature;
        this.moves = moves;
    }

    public UUID getPokemonId() {
        return pokemonId;
    }

    public void setPokemonId(UUID pokemonId) {
        this.pokemonId = pokemonId;
    }

    public int getNoPokedex() {
        return noPokedex;
    }

    public void setNoPokedex(int noPokedex) {
        this.noPokedex = noPokedex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeModel getTypes() {
        return types;
    }

    public void setTypes(TypeModel types) {
        this.types = types;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AbilityModel getAbility() {
        return ability;
    }

    public void setAbility(AbilityModel ability) {
        this.ability = ability;
    }

    public NatureModel getNature() {
        return nature;
    }

    public void setNature(NatureModel nature) {
        this.nature = nature;
    }

    public List<MoveModel> getMoves() {
        return moves;
    }

    public void setMoves(List<MoveModel> moves) {
        this.moves = moves;
    }
}
