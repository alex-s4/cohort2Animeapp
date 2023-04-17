package com.alexproject.cohort2Animeapp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alexproject.cohort2Animeapp.models.AnimeCharacter;

@Repository
public interface AnimeRepository extends CrudRepository<AnimeCharacter, Long> {

	List<AnimeCharacter> findAll();
	
}
