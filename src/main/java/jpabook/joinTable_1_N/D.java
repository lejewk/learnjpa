package jpabook.joinTable_1_N;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class D {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
