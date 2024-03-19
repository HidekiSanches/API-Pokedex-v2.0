package com.example.pokedex.domain.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "nature")
public class NatureModel {
    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "nature_id", length = 36, columnDefinition = "uuid")
    private UUID natureId;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name = "increases", length = 50, nullable = false)
    private String increases;
    @Column(name = "decreases", length = 50, nullable = false)
    private String decreases;

    public NatureModel() {
    }

    public NatureModel(UUID natureId, String name, String increases, String decreases) {
        this.natureId = natureId;
        this.name = name;
        this.increases = increases;
        this.decreases = decreases;
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

    public String getIncreases() {
        return increases;
    }

    public void setIncreases(String increases) {
        this.increases = increases;
    }

    public String getDecreases() { return decreases; }

    public void setDecreases(String decreases) { this.decreases = decreases; }
}
