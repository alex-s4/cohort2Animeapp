package com.alexproject.cohort2Animeapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexproject.cohort2Animeapp.models.AnimeCharacter;
import com.alexproject.cohort2Animeapp.repositories.AnimeRepository;

@Service
public class AnimeService {

	@Autowired
	private AnimeRepository arepo;
	
	// create
	public AnimeCharacter createC_animeCharacter(AnimeCharacter newCharacter) 
	{
		return arepo.save(newCharacter);
	}
	
	
	// update
	public AnimeCharacter updateC_animeCharacter(AnimeCharacter newCharacter) 
	{
		return this.arepo.save(newCharacter);
	}
	
	
	// delete
	public void deleteC_animeCharacter(Long id) 
	{
		this.arepo.deleteById(id);
	}
	
	
	// getone
	public AnimeCharacter getOneC_animeCharacter(Long id) 
	{
		return arepo.findById(id).orElse(null);
	}
	
	// getall
	public List<AnimeCharacter> getAllC_animeCharacters() 
	{
		return arepo.findAll();
	}
	
	
}
