package jpabook.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Baby {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "baby_cart",
            joinColumns = @JoinColumn(name = "baby_id"),
            inverseJoinColumns = @JoinColumn(name = "cart_id"))
    private List<Cart> carts = new ArrayList<Cart>();
}
