package com.example.demo.player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List; // Import the List class
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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


    // @GetMapping
	// public List<player> getPlayer() {
    //     return playerService.getPlayer();
		
	// }

    @GetMapping
    public List<player> getPlayer(
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String position,
            @RequestParam(required = false) String nation) {

        if (team != null && position != null) {
            return playerService.getPlayersByTeamAndPosition(team, position);
        } else if (team != null) {
            return playerService.getPlayersFromTeam(team);
        } else if (name != null) {
            return playerService.getPlayersByName(name);
        } else if (position != null) {
            return playerService.getPlayersByPos(position);
        } else if (nation != null) {
            return playerService.getPlayersByNation(nation);
        } else {
            return playerService.getPlayer();
        }
    }

}
