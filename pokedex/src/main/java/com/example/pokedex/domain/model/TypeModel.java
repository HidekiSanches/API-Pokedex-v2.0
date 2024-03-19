package com.example.pokedex.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

@Entity
@Table(name = "type")
public class TypeModel {
    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "type_id", length = 16, columnDefinition = "uuid")
    private UUID typeId;
    @Column(name = "type1", length = 50, nullable = false)
    private String type1;
    @Column(name = "type2", length = 50, nullable = false)
    private String type2;

    public TypeModel() {
    }

    public TypeModel(UUID typeId, String type1, String type2) {
        this.typeId = typeId;
        this.type1 = type1;
        this.type2 = type2;
    }

    public UUID getTypeId() {
        return typeId;
    }

    public void setTypeId(UUID typeId) {
        this.typeId = typeId;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }
}
