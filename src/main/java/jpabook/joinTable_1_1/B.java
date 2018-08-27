package jpabook.joinTable_1_1;

import javax.persistence.*;

@Entity
@Table
public class B {
    @Id @GeneratedValue
    private Long id;

    private String name;

    @OneToOne(mappedBy = "b")
    private A a;
}
