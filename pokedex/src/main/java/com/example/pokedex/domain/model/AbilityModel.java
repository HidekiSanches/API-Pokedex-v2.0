package com.example.pokedex.domain.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "ability")
public class AbilityModel {
    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "id_ability", length = 16, columnDefinition = "uuid")
    private UUID idAbility;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name = "effect", length = 50, nullable = false)
    private String effect;

    public AbilityModel() {
    }

    public AbilityModel(UUID idAbility,String name, String effect) {
        this.idAbility = idAbility;
        this.name = name;
        this.effect = effect;
    }

    public UUID getIdAbility() {
        return idAbility;
    }

    public void setIdAbility(UUID idAbility) {
        this.idAbility = idAbility;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get() {
        return effect;
    }

    public void set(String effect) {
        this.effect = effect;
    }
}
