package com.s6x.pokeapp.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.s6x.pokeapp.models.dtos.CoachDTO;
import com.s6x.pokeapp.models.dtos.PokemonDTO;
import com.s6x.pokeapp.models.entities.CoachEntity;
import com.s6x.pokeapp.models.entities.PokemonEntity;

@Mapper(componentModel = "spring")
public interface PokemonMapper {
	List<PokemonDTO> pokemonEntitiesToPokemonDTOs(List<PokemonEntity> pokemonEntities);
	PokemonDTO pokemonEntityToPokemonDTO(PokemonEntity pokemonEntity);
	
	List<CoachDTO> coachEntitiesToCoachDTOs(List<CoachEntity> coachEntities);
	CoachDTO coachEntityToCoachDTO(CoachEntity coachEntity);
}
