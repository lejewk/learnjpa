package jpabook.domain;

import javax.persistence.*;

@Entity
@Table(name = "order_item")
public class OrderItem {
    @Id @GeneratedValue
    private Long id;

    @ManyToOne
    private Item item;

    @ManyToOne
    private Order order;

    private int orderPrice; // 주문 가격
    private int count;  // 주문 수량

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
