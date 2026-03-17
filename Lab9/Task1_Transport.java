import java.util.Scanner;

class Transport {
    String name;
    int speed;

    Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void move() {
        System.out.println(name + " движется со скоростью " + speed + " км/ч");
    }

    String getType() {
        return "Транспорт";
    }
}

class Car extends Transport {
    Car(String name, int speed) { super(name, speed); }

    void move() {
        System.out.println(name + " (" + getType() + ") едет по дороге со скоростью " + speed + " км/ч");
    }

    String getType() { return "Машина"; }
}

class Train extends Transport {
    Train(String name, int speed) { super(name, speed); }

    void move() {
        System.out.println(name + " (" + getType() + ") едет по рельсам со скоростью " + speed + " км/ч");
    }

    String getType() { return "Поезд"; }
}

class Airplane extends Transport {
    Airplane(String name, int speed) { super(name, speed); }

    void move() {
        System.out.println(name + " (" + getType() + ") летит со скоростью " + speed + " км/ч");
    }

    String getType() { return "Самолёт"; }
}

public class Task1_Transport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Название машины: ");
        String carName = sc.nextLine();
        System.out.print("Скорость машины: ");
        int carSpeed = sc.nextInt();
        sc.nextLine(); // очищаем буфер после числа

        System.out.print("Название поезда: ");
        String trainName = sc.nextLine();
        System.out.print("Скорость поезда: ");
        int trainSpeed = sc.nextInt();
        sc.nextLine();

        System.out.print("Название самолёта: ");
        String airplaneName = sc.nextLine();
        System.out.print("Скорость самолёта: ");
        int airplaneSpeed = sc.nextInt();

        Transport[] transports = {
            new Car(carName, carSpeed),
            new Train(trainName, trainSpeed),
            new Airplane(airplaneName, airplaneSpeed)
        };

        System.out.println("\nДвижение транспорта:");
        for (Transport t : transports) {
            t.move();
        }
    }
}