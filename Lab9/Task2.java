class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Животное издаёт звук");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + ": Гав!");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + ": Мяу!");
    }
}

class Bird extends Animal {
    Bird(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + ": Чирик!");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Dog d = new Dog("Бобик");
        Cat c = new Cat("Мурка");
        Bird b = new Bird("Кеша");

        d.sound();
        c.sound();
        b.sound();
    }
}