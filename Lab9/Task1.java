class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Марка: " + brand + ", Скорость: " + speed);
    }
}

class Sedan extends Car {
    Sedan(String brand, int speed) {
        super(brand, speed);
    }

    void fuelConsumption() {
        System.out.println("Расход: 7 л/100км");
    }
}

class Truck extends Car {
    Truck(String brand, int speed) {
        super(brand, speed);
    }

    void fuelConsumption() {
        System.out.println("Расход: 20 л/100км");
    }
}

class SUV extends Car {
    SUV(String brand, int speed) {
        super(brand, speed);
    }

    void fuelConsumption() {
        System.out.println("Расход: 10 л/100км");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Sedan s = new Sedan("Toyota", 180);
        Truck t = new Truck("Volvo", 120);
        SUV suv = new SUV("BMW", 160);

        s.displayInfo(); s.fuelConsumption();
        t.displayInfo(); t.fuelConsumption();
        suv.displayInfo(); suv.fuelConsumption();
    }
}