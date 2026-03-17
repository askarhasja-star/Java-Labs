class Car {
    String brand;
    int speed;
    String country;

    Car(String brand, int speed, String country) {
        this.brand = brand;
        this.speed = speed;
        this.country = country;
    }

    void displayInfo() {
        System.out.println("Марка: " + brand + ", Скорость: " + speed + ", Страна: " + country);
    }
}

class Sedan extends Car {
    Sedan(String brand, int speed, String country) {
        super(brand, speed, country);
    }

    void fuelConsumption() {
        System.out.println("Расход: 7 л/100км");
    }
}

class Truck extends Car {
    Truck(String brand, int speed, String country) {
        super(brand, speed, country);
    }

    void fuelConsumption() {
        System.out.println("Расход: 20 л/100км");
    }
}

class SUV extends Car {
    SUV(String brand, int speed, String country) {
        super(brand, speed, country);
    }

    void fuelConsumption() {
        System.out.println("Расход: 10 л/100км");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Sedan s = new Sedan("Toyota", 180, "Japan");
        Truck t = new Truck("Mercedes", 120, "German");
        SUV suv = new SUV("BMW", 160, "German");

        s.displayInfo(); s.fuelConsumption();
        t.displayInfo(); t.fuelConsumption();
        suv.displayInfo(); suv.fuelConsumption();
    }
}