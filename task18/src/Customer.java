import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orderHistory;

    public Customer(String name) {
        this.name = name;
        this.orderHistory = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderHistory.add(order);
    }

    public void displayOrderHistory() {
        System.out.println("История заказов для " + name + ":");
        for (Order order : orderHistory) {
            System.out.println(order);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

