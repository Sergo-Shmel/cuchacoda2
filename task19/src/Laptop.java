public class Laptop extends Device {
    public Laptop(String brand) {
        super(brand);
    }

    public void openBrowser() {
        System.out.println(getBrand() + " открывает браузер.");
    }
}

