package com.example.pokedex.domain.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "nature")
public class NatureModel {
    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "id_nature", length = 16, columnDefinition = "uuid")
    private UUID idNature;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name = "description", length = 200, nullable = false)
    private String description;

    public NatureModel() {
    }

    public NatureModel(UUID idNature, String name, String description) {
        this.idNature = idNature;
        this.name = name;
        this.description = description;
    }

    public UUID getIdNature() {
        return idNature;
    }

    public void setIdNuture(UUID idNature) {
        this.idNature = idNature;
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
