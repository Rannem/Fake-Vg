package dev.rannem.fakeNews.controller;

import dev.rannem.fakeNews.dto.FakeNewsRequest;
import dev.rannem.fakeNews.service.FakeNewsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fakenews/")
@AllArgsConstructor
public class FakeNewsController {

    private FakeNewsService fakeNewsService;

    @PostMapping("/fakenews")
    public ResponseEntity<String> createQuestion(@RequestBody FakeNewsRequest fakeNewsRequest) {
        fakeNewsService.save(fakeNewsRequest);
        return new ResponseEntity<>("Question created", HttpStatus.OK);
    }
}
