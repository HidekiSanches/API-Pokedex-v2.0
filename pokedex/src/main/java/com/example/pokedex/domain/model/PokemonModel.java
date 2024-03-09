package com.example.pokedex.domain.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "pokemon")
public class PokemonModel {
    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "id_pokemon", length = 16, columnDefinition = "uuid")
    private UUID IdPokemon;
    @Column(name = "no_pokedex", length = 50, nullable = false)
    private int noPokedex;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @ManyToOne
    @JoinColumn(name = "fkType", referencedColumnName = "id_type")
    private TypeModel types;
    @Column(name = "description", length = 200, nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn(name = "fkAbility", referencedColumnName = "id_ability")
    private AbilityModel ability;
    @ManyToOne
    @JoinColumn(name = "fkNature", referencedColumnName = "id_nature")
    private NatureModel nature;
    @Column(name = "hp", length = 50, nullable = false)
    private String hp;
    @Column(name = "attack", length = 50, nullable = false)
    private String attack;
    @Column(name = "defense", length = 50, nullable = false)
    private String defense;
    @Column(name = "sp_attack", length = 50, nullable = false)
    private String spAttack;
    @Column(name = "sp_defense", length = 50, nullable = false)
    private String spDefense;
    @OneToMany(mappedBy = "pokemon")
    private List<MoveModel> moves;

    public PokemonModel() {
    }

    public PokemonModel(UUID idPokemon, int noPokedex, String name, TypeModel types, String description, AbilityModel ability, NatureModel nature, String hp, String attack, String defense, String spAttack, String spDefense, List<MoveModel> moves) {
        this.IdPokemon = idPokemon;
        this.noPokedex = noPokedex;
        this.name = name;
        this.types = types;
        this.description = description;
        this.ability = ability;
        this.nature = nature;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spAttack = spAttack;
        this.spDefense = spDefense;
        this.moves = moves;
    }

    public UUID getIdPokemon() {
        return IdPokemon;
    }

    public void setIdPokemon(UUID idPokemon) {
        this.IdPokemon = idPokemon;
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

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getAttack() {
        return attack;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public String getDefense() {
        return defense;
    }

    public void setDefense(String defense) {
        this.defense = defense;
    }

    public String getSpAttack() {
        return spAttack;
    }

    public void setSpAttack(String spAttack) {
        this.spAttack = spAttack;
    }

    public String getSpDefense() {
        return spDefense;
    }

    public void setSpDefense(String spDefense) {
        this.spDefense = spDefense;
    }

    public List<MoveModel> getMoves() {
        return moves;
    }

    public void setMoves(List<MoveModel> moves) {
        this.moves = moves;
    }
}
