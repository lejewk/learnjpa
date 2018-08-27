package jpabook.joinTable_N_1;

import javax.persistence.*;

@Entity
public class F {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne(optional = false)
    @JoinTable(name = "e_f",
            joinColumns = @JoinColumn(name = "f_id"),
            inverseJoinColumns = @JoinColumn(name = "e_id")
    )
    private E e;
}
