class TeamMember {
    String name;

    TeamMember(String n) { name = n; }
}

class Player extends TeamMember {
    Player(String n) { super(n); }
    void play() { System.out.println(name + " играет"); }
}

class Coach extends TeamMember {
    Coach(String n) { super(n); }
    void train() { System.out.println(name + " тренирует"); }
}

class Doctor extends TeamMember {
    Doctor(String n) { super(n); }
    void heal() { System.out.println(name + " лечит"); }
}

public class Task11_Team {
    public static void main(String[] args) {
        Player p = new Player("Али");
        p.play();
    }
}