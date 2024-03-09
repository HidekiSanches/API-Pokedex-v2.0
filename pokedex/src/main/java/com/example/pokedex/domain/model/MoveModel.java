package com.example.pokedex.domain.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "move")
public class MoveModel {
    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "id_move", length = 16, columnDefinition = "uuid")
    private UUID idMove;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @OneToOne
    @JoinColumn(name = "fkType", referencedColumnName = "id_type")
    private TypeModel type;
    @Column(name = "category", length = 50, nullable = false)
    private String category;
    @Column(name = "power", length = 50, nullable = false)
    private int power;
    @Column(name = "accuracy", length = 50, nullable = false)
    private int accuracy;
    @Column(name = "pp", length = 50, nullable = false)
    private int pp;
    @Column(name = "effect", length = 50, nullable = false)
    private String effect;

    public MoveModel() {
    }

    public MoveModel(UUID idMove, String name, TypeModel type, String category, int power, int accuracy, int pp, String effect) {
        this.idMove = idMove;
        this.name = name;
        this.type = type;
        this.category = category;
        this.power = power;
        this.accuracy = accuracy;
        this.pp = pp;
        this.effect = effect;
    }

    public UUID getIdMove() {
        return idMove;
    }

    public void setIdMove(UUID idMove) {
        this.idMove = idMove;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeModel getType() {
        return type;
    }

    public void setType(TypeModel type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPp() {
        return pp;
    }

    public void setPp(int pp) {
        this.pp = pp;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }
}
