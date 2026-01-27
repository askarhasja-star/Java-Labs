class Person4 {
    String name;
    int age;
}

class Student4 extends Person4 {
    String group;
}

public class Task4Inheritance {

    public static void run() {
        Student4 student = new Student4();
        student.name = "Иван";
        student.age = 20;
        student.group = "ИС-2204";

        System.out.println("Имя: " + student.name);
        System.out.println("Возраст: " + student.age);
        System.out.println("Группа: " + student.group);
    }
}