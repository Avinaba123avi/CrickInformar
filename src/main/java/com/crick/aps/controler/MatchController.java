package com.crick.aps.controler;

import java.util.List;

import org.jsoup.Connection.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crick.aps.entities.Match;
import com.crick.aps.services.MatchServices;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController
{
	// get live matches
	
	private MatchServices matchServices;
	
	public MatchController(MatchServices matchServices) 
	{
		this.matchServices = matchServices;
	}

	@GetMapping("/live")
	public ResponseEntity<List<Match>> getLiveMatches()
	{
		return new ResponseEntity<>(this.matchServices.getLiveMatches(),HttpStatus.OK);
		
	}
	
	// get all matches 
	
	@GetMapping
	public ResponseEntity<List<Match>> getAllMatches()
	{
		return new ResponseEntity<>(this.matchServices.getAllMatches(),HttpStatus.OK);
		
	}
	
	// get point table
	@GetMapping("/poin-table")
	public ResponseEntity<?> getPointTable()
	{
		return new ResponseEntity<>(this.matchServices.getPointTable(),HttpStatus.OK); 
		
	}
}
