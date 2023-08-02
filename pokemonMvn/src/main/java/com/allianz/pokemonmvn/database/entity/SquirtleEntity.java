package com.allianz.pokemonmvn.database.entity;

import com.allianz.pokemonmvn.model.pokemon.Pokemon;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.UUID;

@Entity
@Table
@AttributeOverride(name = "uuid", column = @Column(name = "squirtle_uuid"))
@Data
public class SquirtleEntity extends PokemonEntity {

}
