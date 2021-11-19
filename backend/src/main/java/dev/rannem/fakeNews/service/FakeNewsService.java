package dev.rannem.fakeNews.service;

import dev.rannem.fakeNews.dto.FakeNewsRequest;
import dev.rannem.fakeNews.entities.FakeNews;
import dev.rannem.fakeNews.repos.FakeNewsRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
@Transactional
@Slf4j
public class FakeNewsService {
    private final FakeNewsRepository fakeNewsRepository;

    public void save(FakeNewsRequest fakeNewsRequest) {
        FakeNews fakenews = new FakeNews();
        fakenews.setTitle(fakeNewsRequest.getTitle());
        fakenews.setUnderTitle(fakeNewsRequest.getUnderTitle());
        fakenews.setPicture1(fakeNewsRequest.getPicture1());
        fakenews.setPicture2(fakeNewsRequest.getPicture2());
        fakenews.setMainText1(fakeNewsRequest.getMainText1());
        fakenews.setMainText2(fakeNewsRequest.getMainText2());
        fakeNewsRepository.save(fakenews);
    }
}
