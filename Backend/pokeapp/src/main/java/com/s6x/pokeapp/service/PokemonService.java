package com.s6x.pokeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.s6x.pokeapp.mapper.PokemonMapper;
import com.s6x.pokeapp.models.dtos.CoachDTO;
import com.s6x.pokeapp.models.dtos.PokemonDTO;
import com.s6x.pokeapp.models.entities.CoachEntity;
import com.s6x.pokeapp.repository.CoachRepository;
import com.s6x.pokeapp.repository.PokemonRepository;

@Service
public class PokemonService {
	
	// REPOs
	@Autowired
	private PokemonRepository pokemonRepository;
	@Autowired
	private CoachRepository coachRepository;
	
	// MAPPER
	@Autowired
	private PokemonMapper pokemonMapper;
	
	
	// listar pokemons
	public List<PokemonDTO> getListOfAllPokemons(){
		return pokemonMapper.pokemonEntitiesToPokemonDTOs(pokemonRepository.findAll());
	}
	
	// listar entrenadores
	public List<CoachDTO> getListOfAllCoaches(){
		return pokemonMapper.coachEntitiesToCoachDTOs(coachRepository.findAll());
	}
	
	// Crear entrenador pokemon
	public CoachDTO createPokemonCoach(CoachDTO coach) {
		CoachEntity coachEntity = CoachEntity.builder()
									.id(coach.getId())
									.username(coach.getUsername())
									.build();
		return pokemonMapper.coachEntityToCoachDTO(coachRepository.save(coachEntity));
	}
	
}
