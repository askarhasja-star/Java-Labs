class Person {
    String name;

    Person(String n) { name = n; }
}

class Student extends Person {
    Student(String n) { super(n); }
    void study() { System.out.println(name + " учится"); }
}

class Teacher extends Person {
    Teacher(String n) { super(n); }
    void teach() { System.out.println(name + " преподаёт"); }
}

class Administrator extends Person {
    Administrator(String n) { super(n); }
    void manage() { System.out.println(name + " управляет"); }
}

public class Task5_Education {
    public static void main(String[] args) {
        Student s = new Student("Али");
        Teacher t = new Teacher("Иван");

        s.study();
        t.teach();
    }
}