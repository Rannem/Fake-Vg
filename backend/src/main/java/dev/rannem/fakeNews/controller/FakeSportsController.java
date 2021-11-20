package dev.rannem.fakeNews.controller;

import dev.rannem.fakeNews.dto.FakeNewsRequest;
import dev.rannem.fakeNews.dto.FakeSportsRequest;
import dev.rannem.fakeNews.service.FakeNewsService;
import dev.rannem.fakeNews.service.FakeSportsService;
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
public class FakeSportsController {

    private FakeSportsService fakeSportsService;

    @PostMapping("/fakesports")
    public ResponseEntity<String> createQuestion(@RequestBody FakeSportsRequest fakeSportsRequest) {
        fakeSportsService.save(fakeSportsRequest);
        return new ResponseEntity<>("Question created", HttpStatus.OK);
    }
}





