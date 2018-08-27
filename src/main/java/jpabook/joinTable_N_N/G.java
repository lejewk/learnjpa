package jpabook.joinTable_N_N;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class G {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    @JoinTable(name = "g_h",
            joinColumns = @JoinColumn(name = "g_id"),
            inverseJoinColumns = @JoinColumn(name = "h_id")
    )
    private List<H> hs = new ArrayList<H>();
}
