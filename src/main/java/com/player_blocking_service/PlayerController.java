package com.player_blocking_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @GetMapping("/players")
    public List<String>getPlayers() throws InterruptedException {
        Thread.sleep(3000);
     return List.of("Ms Dhoni", "Virat Kohli", "Rohit Sharma", "AB");
    }
}
