package jpabook.joinTable_N_1;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class E {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "e")
    private List<F> fs = new ArrayList<F>();
}
