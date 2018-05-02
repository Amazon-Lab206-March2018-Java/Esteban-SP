package com.poesteba.pokemon;

public class PokedexTest {

	public static void main(String[] args) {

		Pokedex pokedex = new Pokedex();
		Pokemon pikachu = pokedex.createPokemon("Pikachu", 70, "Electric Rat");   //using createPokemon
		Pokemon bulbasaur = pokedex.createPokemon("Bulbasaur", 60, "Grass");
		Pokemon squirtle = pokedex.createPokemon("Squirtle", 60, "Water");
		Pokemon charizard = new Pokemon("Charizard", 90, "Fire Dragon");  // using new Pokemon() constructor
		Pokemon mewtwo = new Pokemon("Mewtwo", 100, "Psychic Clone");  
		System.out.println(pokedex.pokemonInfo(bulbasaur));
		pokedex.attackPokemon(bulbasaur);
		pokedex.attackPokemon(bulbasaur);
		System.out.println(pokedex.pokemonInfo(bulbasaur));
		System.out.println(pokedex.pokemonInfo(mewtwo));
		System.out.println(pokedex.pokemonInfo(pikachu));
		pokedex.attackPokemon(squirtle);
		pokedex.attackPokemon(charizard);
		System.out.println(pokedex.pokemonInfo(charizard));
		System.out.println(pokedex.pokemonInfo(squirtle));
	}

}
