class GameCharacter {
    void attack() {
        System.out.println("Атака");
    }
}

class Warrior extends GameCharacter {
    void attack() { System.out.println("Удар мечом"); }
}

class Mage extends GameCharacter {
    void attack() { System.out.println("Заклинание"); }
}

class Archer extends GameCharacter {
    void attack() { System.out.println("Выстрел стрелой"); }
}

public class Task14_Character {
    public static void main(String[] args) {
        GameCharacter c = new Mage();
        c.attack();
    }
}