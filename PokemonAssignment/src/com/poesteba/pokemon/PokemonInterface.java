package com.poesteba.pokemon;

public interface PokemonInterface {
	Pokemon createPokemon(String name, int health, String type); //This method creates and returns Pokemon.
	void attackPokemon(Pokemon pokemon); //  This method lowers the attacked Pokemon's health by 10 and returns void
	String pokemonInfo(Pokemon pokemon); // This method returns a String with the name, health, and type of the pokemon
}
