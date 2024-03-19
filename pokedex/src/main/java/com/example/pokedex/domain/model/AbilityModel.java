package com.example.pokedex.domain.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "ability")
public class AbilityModel {
    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "ability_id", length = 16, columnDefinition = "uuid")
    private UUID abilityId;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name = "effect", length = 50, nullable = false)
    private String effect;

    public AbilityModel() {
    }

    public AbilityModel(UUID abilityId,String name, String effect) {
        this.abilityId = abilityId;
        this.name = name;
        this.effect = effect;
    }

    public UUID getAbilityId() {
        return abilityId;
    }

    public void setAbilityId(UUID abilityId) {
        this.abilityId = abilityId;
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
