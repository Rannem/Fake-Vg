package dev.rannem.fakeNews.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clubId;

    private String clubName;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "leagueId", referencedColumnName = "leagueId")
    private League league;

    private int score;
}
