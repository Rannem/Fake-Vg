package dev.rannem.fakeNews.service;

import dev.rannem.fakeNews.dto.PlayerRequest;
import dev.rannem.fakeNews.entities.Player;
import dev.rannem.fakeNews.repos.ClubRepository;
import dev.rannem.fakeNews.repos.PlayerRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
@Slf4j
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final ClubRepository clubRepository;

    public void save(PlayerRequest playerRequest) {
        Player player = new Player();
        player.setName(playerRequest.getName());
        player.setHeigt(playerRequest.getHeight());
        player.setWeight(playerRequest.getWeight());
        player.setPosisitons(playerRequest.getPosisitons());
        player.setGoals(playerRequest.getGoals());
        player.setClub(clubRepository.findClubByClubId(playerRequest.getClubId()));
        player.setNationality(playerRequest.getNationality());
        player.setPreferredFoot(playerRequest.getPreferredFoot());
        playerRepository.save(player);
    }

}
