package com.github.cidades.citiesapi.staties.repositories;

import com.github.cidades.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
