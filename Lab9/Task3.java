class Person {
    String firstName;
    String lastName;

    Person(String f, String l) {
        firstName = f;
        lastName = l;
    }

    void displayInfo() {
        System.out.println(firstName + " " + lastName);
    }
}

class Student extends Person {
    int id;

    Student(String f, String l, int id) {
        super(f, l);
        this.id = id;
    }

    void study() {
        System.out.println(firstName + " учится");
    }
}

class Professor extends Person {
    String subject;

    Professor(String f, String l, String subject) {
        super(f, l);
        this.subject = subject;
    }

    void teach() {
        System.out.println(firstName + " преподаёт " + subject);
    }
}

public class Task3 {
    public static void main(String[] args) {
        Student s = new Student("Али", "Кан", 123);
        Professor p = new Professor("Иван", "Иванов", "Математика");

        s.displayInfo(); s.study();
        p.displayInfo(); p.teach();
    }
}