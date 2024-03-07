package com.s6x.pokeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.s6x.pokeapp.models.dtos.CoachDTO;
import com.s6x.pokeapp.models.dtos.PokemonDTO;
import com.s6x.pokeapp.service.PokemonService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/")
public class PokemonRestController {
	@Autowired
	private PokemonService pokemonService;
	
	// listar todos los pokemons
	@GetMapping("/pokemons")
	public ResponseEntity<List<PokemonDTO>> getListOfAllPokemons(){
		return ResponseEntity.ok(pokemonService.getListOfAllPokemons());
	}
	
	@GetMapping("/check")
    public String check(){
        return "Working...!";
    }
	
	// listar todos los entrenadores
	@GetMapping("/coaches")
	public ResponseEntity<List<CoachDTO>> getListOfAllCoaches(){
		return ResponseEntity.ok(pokemonService.getListOfAllCoaches());
	}
	// crear o registrar un nuevo entrenador
	@PostMapping("/coach")
	public ResponseEntity<CoachDTO> createCoach(@RequestBody CoachDTO coach){
		return ResponseEntity.status(HttpStatus.CREATED).body(this.pokemonService.createPokemonCoach(coach));
	}
}
