class Appliance {
    void operate() {
        System.out.println("Устройство работает");
    }
}

class Refrigerator extends Appliance {
    void operate() { System.out.println("Холодильник охлаждает"); }
}

class WashingMachine extends Appliance {
    void operate() { System.out.println("Стиральная машина стирает"); }
}

class Microwave extends Appliance {
    void operate() { System.out.println("Микроволновка греет"); }
}

public class Task15_Appliance {
    public static void main(String[] args) {
        Appliance a = new Microwave();
        a.operate();
    }
}