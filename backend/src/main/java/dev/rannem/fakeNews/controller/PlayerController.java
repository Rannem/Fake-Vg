package dev.rannem.fakeNews.controller;

import dev.rannem.fakeNews.dto.PlayerRequest;
import dev.rannem.fakeNews.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fakesports/")
@AllArgsConstructor
public class PlayerController {

    private PlayerService playerService;

    @PostMapping("/player")
    public ResponseEntity<String> createQuestion(@RequestBody PlayerRequest playerRequest) {
        playerService.save(playerRequest);
        return new ResponseEntity<>("Player created", HttpStatus.OK);
    }
}
