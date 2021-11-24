package dev.rannem.fakeNews.service;

import dev.rannem.fakeNews.dto.ClubRequest;
import dev.rannem.fakeNews.dto.PlayerRequest;
import dev.rannem.fakeNews.entities.Club;
import dev.rannem.fakeNews.entities.Player;
import dev.rannem.fakeNews.repos.ClubRepository;
import dev.rannem.fakeNews.repos.LeagueRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
@Slf4j
public class ClubService {

    private final LeagueRepository leagueRepository;
    private final ClubRepository clubRepository;

    public void save(ClubRequest clubRequest) {
       Club club = new Club();
       club.setClubName(clubRequest.getClubName());
       club.setScore(clubRequest.getScore());
       club.setLeague(leagueRepository.findLeagueByLeagueId(clubRequest.getLeagueId()));
        clubRepository.save(club);
    }
}
