public class Task3Scope {

    int classVariable = 5; 

    void show() {
        int localVariable = 10; 

        System.out.println("Поле класса: " + classVariable);
        System.out.println("Локальная переменная: " + localVariable);
    }

    public static void run() {
        Task3Scope obj = new Task3Scope();
        obj.show();
    }
}