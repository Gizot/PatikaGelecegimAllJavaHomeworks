package com.allianz.pokemonmvn.database.entity;

import com.allianz.pokemonmvn.util.dbutil.BaseEntity;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;
@Entity
@Table
@AttributeOverride(name = "uuid", column = @Column(name = "character_uuid"))
@Data
public class CharOfPokemon extends BaseEntity {
    private UUID uuid;
    private String name;
    private int damage;
    private int health;
    private int money;
}
