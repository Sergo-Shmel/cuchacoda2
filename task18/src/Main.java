//Автоматизированная система заказов
//Создайте классы Order, Customer, и Product.
// Реализуйте систему, где можно добавлять заказы, отображать общую стоимость заказа
// и просматривать историю заказов.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Книга", 500.0);
        Product product2 = new Product("Ноутбук", 50000.0);
        Product product3 = new Product("Телефон", 20000.0);

        Order order1 = new Order();
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order();
        order2.addProduct(product3);

        Customer customer = new Customer("Иван Иванов");
        customer.addOrder(order1);
        customer.addOrder(order2);

        customer.displayOrderHistory();
    }
}