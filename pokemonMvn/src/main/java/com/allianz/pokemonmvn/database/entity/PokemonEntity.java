package com.allianz.pokemonmvn.database.entity;

import com.allianz.pokemonmvn.model.pokemon.Pokemon;
import com.allianz.pokemonmvn.util.dbutil.BaseEntity;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;
@Entity
@Table
@AttributeOverride(name = "uuid", column = @Column(name = "pokemon_uuid"))
@Data

public class PokemonEntity extends BaseEntity {

    private UUID uuid;
    private String name;
    private int damage;
    private int health;
    private int award;
    private  int originalHealth;
}
