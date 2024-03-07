package com.s6x.pokeapp.models.dtos;

import com.s6x.pokeapp.models.entities.Ability;
import com.s6x.pokeapp.models.entities.PokemonType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PokemonDTO {
	private Long id;
	private String name;
	private String avatar;
	private PokemonType type;
	private Ability ability;
	private Integer level;
	private Integer health;
	private Integer health_max;
	private CoachDTO coach;
}
