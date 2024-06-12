package com.sofia.ligabetplay.services;
import org.springframework.data.jpa.repository.JpaRepository;
import com.sofia.ligabetplay.models.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{
    
}
