package jpabook.joinTable_N_N;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class H {
    @Id
    @GeneratedValue
    private Long id;
}
