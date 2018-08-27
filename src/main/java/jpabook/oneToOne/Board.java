package jpabook.oneToOne;

import javax.persistence.*;

@Entity
public class Board {
    @Id @GeneratedValue
    private Long id;

    private String title;

    @OneToOne(mappedBy = "board")
    private BoardDetail boardDetail;
}
