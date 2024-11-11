public class Device {
    private String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    public void turnOn(){
        System.out.println(brand + " Turning on");
    };

    public void turnOff(){
        System.out.println(brand + " Turning off");
    };

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Device brand: " + brand ;
    }
}
