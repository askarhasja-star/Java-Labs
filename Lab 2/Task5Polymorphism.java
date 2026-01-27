class Person5 {
    void displayInfo() {
        System.out.println("Это человек");
    }
}

class Student5 extends Person5 {
    @Override
    void displayInfo() {
        System.out.println("Это студент");
    }
}

public class Task5Polymorphism {

    public static void run() {
        Person5 person = new Student5(); 
        person.displayInfo();
    }
}