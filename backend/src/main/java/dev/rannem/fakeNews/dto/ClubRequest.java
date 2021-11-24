package dev.rannem.fakeNews.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClubRequest {
    private String clubName;

    private Long leagueId;

    private int score;
}
