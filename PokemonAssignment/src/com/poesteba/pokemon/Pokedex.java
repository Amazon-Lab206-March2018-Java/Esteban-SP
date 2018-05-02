package com.poesteba.pokemon;

public class Pokedex extends AbstractPokemon {
	@Override
	public String pokemonInfo(Pokemon pokemon) { // This method returns a String with the name, health, and type of the pokemon
		return ("Name: "+pokemon.getName()+" / Health: "+pokemon.getHealth()+" / Type: "+pokemon.getType()+".");
	}
}
