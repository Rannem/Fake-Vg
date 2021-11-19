package dev.rannem.fakeNews.repos;

import dev.rannem.fakeNews.entities.FakeNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FakeNewsRepository extends JpaRepository <FakeNews, Long> {
}
