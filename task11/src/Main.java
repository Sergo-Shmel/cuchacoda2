import java.util.List;

//Класс "Магазин"
//Реализуйте класс Product с полями name, price, и quantity.
// Создайте класс Store, который содержит список продуктов и методы для добавления,
// удаления и поиска товаров по имени.
public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        store.addProduct(new Product("Milk",1000,10));
        store.addProduct(new Product("Water",100,4));
        store.addProduct(new Product("Egg",10,20));

        System.out.println("Все продукты в магазине:");
        store.displayAllProducts();

        store.removeProduct("Water");
        System.out.println("Все продукты в магазине:");
        store.displayAllProducts();

        List<Product> findProduct = store.findProductByName("Egg");
        for(Product product : findProduct){
            System.out.println(product);
        }



    }
}