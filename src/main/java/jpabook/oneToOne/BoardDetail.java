package jpabook.oneToOne;

import javax.persistence.*;

@Entity
public class BoardDetail {
    @Id
    private Long id;

    private String content;

    @MapsId
    @OneToOne
    @JoinColumn(name = "board_id")
    private Board board;
}
