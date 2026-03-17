class Employee {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    void work() {
        System.out.println(name + " работает");
    }
}

class Manager extends Employee {
    Manager(String n, double s) { super(n, s); }
    void work() { System.out.println(name + " управляет"); }
}

class Developer extends Employee {
    Developer(String n, double s) { super(n, s); }
    void work() { System.out.println(name + " пишет код"); }
}

public class Task3_Employee {
    public static void main(String[] args) {
        Employee e1 = new Manager("Али", 5000);
        Employee e2 = new Developer("Иван", 4000);

        e1.work();
        e2.work();
    }
}