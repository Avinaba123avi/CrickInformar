package com.crick.aps.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.aps.entities.Match;

public interface MatchRepo extends JpaRepository<Match,Integer>{
	
	Optional<Match> findByTeamHeading(String teamHeading);

}
