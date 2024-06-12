package com.sofia.ligabetplay.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sofia.ligabetplay.models.Team;

public interface TeamRepository extends JpaRepository<Team, Integer>{
    
}
