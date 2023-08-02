package com.allianz.pokemonmvn.database.repository;

import com.allianz.pokemonmvn.model.pokeCharacter.CharOfPokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonsCharacterEntity extends JpaRepository <CharOfPokemon, Long> {
}
