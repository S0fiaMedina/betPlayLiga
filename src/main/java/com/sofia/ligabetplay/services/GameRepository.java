package com.sofia.ligabetplay.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sofia.ligabetplay.models.Game;

public interface GameRepository  extends JpaRepository<Game, Integer>{
}
