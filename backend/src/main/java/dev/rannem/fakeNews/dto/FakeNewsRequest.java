package dev.rannem.fakeNews.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FakeNewsRequest {
    private String title;

    private String underTitle;

    private String picture1;

    private String picture2;

    private String mainText1;

    private String mainText2;
}