package com.example.pokedex.domain.dto;

import java.util.UUID;

public class DadosTypeCompleto {
    private UUID id;
    private String type1;
    private String type2;

    public DadosTypeCompleto() {
    }

    public DadosTypeCompleto(UUID id, String type1, String type2) {
        this.id = id;
        this.type1 = type1;
        this.type2 = type2;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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
