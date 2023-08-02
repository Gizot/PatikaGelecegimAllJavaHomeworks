package com.allianz.pokemonmvn.model.pokemon;

import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pokemon {

    private UUID uuid;
    private String name;
    private int damage;
    private int health;
    private int award;
    private  int originalHealth;


}
