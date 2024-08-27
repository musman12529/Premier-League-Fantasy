package com.example.demo.player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List; // Import the List class
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@RestController
@RequestMapping("api/v1/player")
public class playerController {

    private final playerService playerService;


    @Autowired
    public playerController(playerService playerService) {
        this.playerService = playerService;
    }


    @GetMapping
	public List<player> getPlayer() {
        return playerService.getPlayer();
		
	}

}
