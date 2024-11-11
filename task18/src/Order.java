import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;

    public Order() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalCost() {
        double totalCost = 0;
        for (Product product : products) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Заказ:\n");
        for (Product product : products) {
            sb.append("- ").append(product).append("\n");
        }
        sb.append("Общая стоимость: ").append(getTotalCost());
        return sb.toString();
    }
}