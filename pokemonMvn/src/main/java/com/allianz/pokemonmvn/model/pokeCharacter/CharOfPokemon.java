package com.allianz.pokemonmvn.model.pokeCharacter;


import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class CharOfPokemon {

    private UUID uuid;
    private String name;
    private int damage;
    private int health;
    private int money;



}
