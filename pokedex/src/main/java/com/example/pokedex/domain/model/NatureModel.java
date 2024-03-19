package com.example.pokedex.domain.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "nature")
public class NatureModel {
    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "nature_id", length = 16, columnDefinition = "uuid")
    private UUID natureId;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name = "description", length = 200, nullable = false)
    private String description;

    public NatureModel() {
    }

    public NatureModel(UUID natureId, String name, String description) {
        this.natureId = natureId;
        this.name = name;
        this.description = description;
    }

    public UUID getNatureId() {
        return natureId;
    }

    public void setNatureId(UUID natureId) {
        this.natureId = natureId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String get() {
        return description;
    }

    public void set(String description) {
        this.description = description;
    }
}
