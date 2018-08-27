package jpabook.joinTable_1_N;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class C {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany
    @JoinTable(name = "c_d",
            joinColumns = @JoinColumn(name = "c_id"),
            inverseJoinColumns = @JoinColumn(name = "d_id")
    )
    private List<D> ds = new ArrayList<D>();
}
