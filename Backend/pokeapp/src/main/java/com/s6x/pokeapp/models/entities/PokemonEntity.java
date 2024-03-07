package com.s6x.pokeapp.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "POKEMON")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PokemonEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "AVATAR")
	private String avatar;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "TYPE")
	private PokemonType type;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "ABILITY")
	private Ability ability;
	
	@Column(name = "LEVEL")
	private Integer level;
	
	@Column(name = "HEALTH")
	private Integer health;
	
	@Column(name = "HEALTH_MAX")
	private Integer health_max;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COACH", nullable = true)
	private CoachEntity coach;
}
