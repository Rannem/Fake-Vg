package dev.rannem.fakeNews.service;

import dev.rannem.fakeNews.dto.FakeSportsRequest;
import dev.rannem.fakeNews.entities.FakeSports;
import dev.rannem.fakeNews.repos.FakeNewsRepository;
import dev.rannem.fakeNews.repos.FakeSportRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
@Slf4j
public class FakeSportsService {
    private final FakeSportRepository fakeSportRepository;

    public void save (FakeSportsRequest fakeSportsRequest) {
        FakeSports fakeSports = new FakeSports();
        fakeSports.setTest(fakeSportsRequest.getTest());
        fakeSportRepository.save(fakeSports);
    }

}
