package com.allianz.pokemonmvn.database.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@AttributeOverride(name = "uuid", column = @Column(name = "pokemon_uuid"))
@Data
public class BalbasaurEntity extends PokemonEntity {
}
