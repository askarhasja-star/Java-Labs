class Component {
    String name;

    Component(String name) {
        this.name = name;
    }

    void showInfo() {
        System.out.println("Компонент: " + name);
    }
}

class CPU extends Component {
    CPU() { super("CPU"); }
}

class RAM extends Component {
    RAM() { super("RAM"); }
}

class GPU extends Component {
    GPU() { super("GPU"); }
}

public class Task9_Component {
    public static void main(String[] args) {
        Component c = new CPU();
        c.showInfo();
    }
}