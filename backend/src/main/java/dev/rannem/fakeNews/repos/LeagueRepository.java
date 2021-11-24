package dev.rannem.fakeNews.repos;

import dev.rannem.fakeNews.entities.Club;
import dev.rannem.fakeNews.entities.League;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeagueRepository extends JpaRepository<League, Long> {
    League findLeagueByLeagueId(Long leagueId);
}
