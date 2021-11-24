package dev.rannem.fakeNews.controller;

import dev.rannem.fakeNews.dto.LeagueRequest;
import dev.rannem.fakeNews.service.LeagueService;
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
public class LeagueController {

    private LeagueService leagueService;

    @PostMapping("/league")
    public ResponseEntity<String> createQuestion(@RequestBody LeagueRequest leagueRequest) {
        leagueService.save(leagueRequest);
        return new ResponseEntity<>("Player created", HttpStatus.OK);
    }
}
