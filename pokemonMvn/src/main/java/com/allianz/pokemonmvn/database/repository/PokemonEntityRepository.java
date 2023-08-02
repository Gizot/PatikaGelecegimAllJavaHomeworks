package com.allianz.pokemonmvn.database.repository;

import com.allianz.pokemonmvn.database.entity.PokemonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonEntityRepository extends JpaRepository<PokemonEntity, Long> {

    List<PokemonEntity> findAllByNameStartingWith(String key);

    List<PokemonEntity> findAllByNameContainsIgnoreCase(String key);

    List<PokemonEntity> findAllByNameStartingWithOrSurnameStartingWith(String name, String surname);
}
