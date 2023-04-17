package com.alexproject.cohort2Animeapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexproject.cohort2Animeapp.models.AnimeCharacter;
import com.alexproject.cohort2Animeapp.services.AnimeService;

@RestController
public class AnimeCharacterController {
	
	@Autowired
	private AnimeService aservices;
	
	@GetMapping("/")
	public List<AnimeCharacter> index() {
		return aservices.getAllC_animeCharacters();
	}
	
	@PostMapping("/new")
	public AnimeCharacter createCharacter(AnimeCharacter newC) {
		
		return aservices.createC_animeCharacter(newC);
	}
	
	@GetMapping("/character/{id}")
	public AnimeCharacter getOneCharacter(@PathVariable Long id) {
		return aservices.getOneC_animeCharacter(id);
	}
	
	@PutMapping("/update/{id}")
	public AnimeCharacter updateCharacter(@PathVariable Long id, AnimeCharacter newC) {
		return aservices.updateC_animeCharacter(newC);
	}
	
}
