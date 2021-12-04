package com.github.cidades.citiesapi.countries.repositories;

import com.github.cidades.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
