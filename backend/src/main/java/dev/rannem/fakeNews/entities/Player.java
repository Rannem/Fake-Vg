package dev.rannem.fakeNews.entities;

import dev.rannem.fakeNews.enums.Posisitons;
import dev.rannem.fakeNews.enums.PreferredFoot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int heigt;

    private float weight;

    private Posisitons posisitons;

    private int goals;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "clubId", referencedColumnName = "clubId")
    private Club club;

    private String nationality;

    private PreferredFoot preferredFoot;
}
