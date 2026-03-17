class Animal {
    void makeSound() {
        System.out.println("Животное издаёт звук");
    }
}

class Lion extends Animal {
    void makeSound() { System.out.println("Лев: Ррр"); }
}

class Elephant extends Animal {
    void makeSound() { System.out.println("Слон: Трууу"); }
}

class Monkey extends Animal {
    void makeSound() { System.out.println("Обезьяна: У-у-у"); }
}

public class Task7_Animal {
    public static void main(String[] args) {
        Animal a = new Lion();
        a.makeSound();
    }
}