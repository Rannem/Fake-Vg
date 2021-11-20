package dev.rannem.fakeNews.repos;

import dev.rannem.fakeNews.entities.FakeSports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FakeSportRepository extends JpaRepository <FakeSports, Long> {
}
