class Device {
    String brand;

    Device(String brand) {
        this.brand = brand;
    }

    void turnOn() {
        System.out.println("Устройство включено");
    }
}

class Laptop extends Device {
    Laptop(String b) { super(b); }
    void turnOn() { System.out.println(brand + " ноутбук включён"); }
}

class Smartphone extends Device {
    Smartphone(String b) { super(b); }
    void turnOn() { System.out.println(brand + " телефон включён"); }
}

public class Task6_Device {
    public static void main(String[] args) {
        Device d = new Laptop("HP");
        d.turnOn();
    }
}