package com.sofia.ligabetplay.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sofia.ligabetplay.models.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{
    
}
