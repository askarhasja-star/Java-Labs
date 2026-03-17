class Instrument {
    void playSound() {
        System.out.println("Звук инструмента");
    }
}

class Guitar extends Instrument {
    void playSound() { System.out.println("Гитара играет"); }
}

class Piano extends Instrument {
    void playSound() { System.out.println("Пианино играет"); }
}

class Drums extends Instrument {
    void playSound() { System.out.println("Барабаны играют"); }
}

public class Task12_Instrument {
    public static void main(String[] args) {
        Instrument i = new Guitar();
        i.playSound();
    }
}