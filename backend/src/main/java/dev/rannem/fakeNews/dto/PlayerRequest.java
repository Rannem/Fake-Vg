package dev.rannem.fakeNews.dto;

import dev.rannem.fakeNews.enums.Posisitons;
import dev.rannem.fakeNews.enums.PreferredFoot;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerRequest {
    private String name;

    private int height;

    private float weight;

    private Posisitons posisitons;

    private int goals;

    private Long clubId;

    private String nationality;

    private PreferredFoot preferredFoot;

}
