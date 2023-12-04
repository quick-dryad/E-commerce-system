import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Order placeOrder(Product product, int quantity) {
        Order order = new Order(this, product, quantity);
        orders.add(order);
        return order;
    }
}
