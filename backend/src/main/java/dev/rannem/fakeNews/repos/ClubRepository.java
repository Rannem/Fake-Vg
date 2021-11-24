package dev.rannem.fakeNews.repos;

import dev.rannem.fakeNews.entities.Club;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<Club, Long> {
    Club findClubByClubId(Long clubId);
}
