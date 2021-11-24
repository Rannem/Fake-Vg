package dev.rannem.fakeNews.service;

import dev.rannem.fakeNews.dto.LeagueRequest;
import dev.rannem.fakeNews.dto.PlayerRequest;
import dev.rannem.fakeNews.entities.League;
import dev.rannem.fakeNews.entities.Player;
import dev.rannem.fakeNews.repos.LeagueRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
@Slf4j
public class LeagueService {

    private final LeagueRepository leagueRepository;

    public void save(LeagueRequest leagueRequest) {
        League league = new League();
        league.setLeagueName(leagueRequest.getLeagueName());
        leagueRepository.save(league);
    }
}
