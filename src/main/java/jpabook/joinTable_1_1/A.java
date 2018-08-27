package jpabook.joinTable_1_1;

import javax.persistence.*;

@Entity
public class A {
    @Id @GeneratedValue
    private Long id;

    private String name;

    @OneToOne
    @JoinTable(name = "a_b",
            joinColumns = @JoinColumn(name = "a_id"),
            inverseJoinColumns = @JoinColumn(name = "b_id")
    )
    private B b;
}
