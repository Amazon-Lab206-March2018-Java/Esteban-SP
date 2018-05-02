package com.poesteba.pokemon;

public abstract class AbstractPokemon implements PokemonInterface {

	@Override
	public Pokemon createPokemon(String name, int health, String type) {  // This method creates and returns Pokemon.
		Pokemon poke = new Pokemon(name, health, type);
		return poke;
	}

	@Override
	public void attackPokemon(Pokemon pokemon) {  // This method lowers the attacked Pokemon's health by 10 and returns void
		pokemon.setHealth(pokemon.getHealth()-10);
	}
}
