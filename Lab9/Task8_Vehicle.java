class Vehicle {
    void startEngine() {
        System.out.println("Двигатель запущен");
    }
}

class Bike extends Vehicle {
    void startEngine() { System.out.println("Мотоцикл завёлся"); }
}

class Bus extends Vehicle {
    void startEngine() { System.out.println("Автобус завёлся"); }
}

class Taxi extends Vehicle {
    void startEngine() { System.out.println("Такси готово"); }
}

public class Task8_Vehicle {
    public static void main(String[] args) {
        Vehicle v = new Taxi();
        v.startEngine();
    }
}