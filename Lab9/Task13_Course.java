class Course {
    String name;

    Course(String n) { name = n; }

    void startCourse() {
        System.out.println("Курс начался");
    }
}

class ProgrammingCourse extends Course {
    ProgrammingCourse() { super("Программирование"); }
}

class MathCourse extends Course {
    MathCourse() { super("Математика"); }
}

class HistoryCourse extends Course {
    HistoryCourse() { super("История"); }
}

public class Task13_Course {
    public static void main(String[] args) {
        Course c = new ProgrammingCourse();
        c.startCourse();
    }
}