package com.s6x.pokeapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.s6x.pokeapp.models.entities.CoachEntity;

@Repository
public interface CoachRepository extends JpaRepository<CoachEntity, Long> {}
