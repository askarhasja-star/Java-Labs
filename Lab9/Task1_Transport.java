import java.util.Scanner;

class Transport {
    String name;
    int speed;

    Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void move() {
        System.out.println(name + " движется");
    }
}

class Car extends Transport {
    Car(String n, int s) { super(n, s); }
    void move() { System.out.println(name + " едет по дороге"); }
}

class Train extends Transport {
    Train(String n, int s) { super(n, s); }
    void move() { System.out.println(name + " едет по рельсам"); }
}

class Airplane extends Transport {
    Airplane(String n, int s) { super(n, s); }
    void move() { System.out.println(name + " летит"); }
}

public class Task1_Transport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Название: ");
        String name = sc.next();

        System.out.print("Скорость: ");
        int speed = sc.nextInt();

        Transport t = new Car(name, speed);
        t.move();
    }
}