import java.util.*;

public class AdvancedCalculator {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> history = new ArrayList<>();

    // методы
    public static double add(double a, double b) { return a + b; }
    public static double sub(double a, double b) { return a - b; }
    public static double mul(double a, double b) { return a * b; }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Ошибка: деление на ноль");
            return 0;
        }
        return a / b;
    }

    public static double power(double a, double b) {
        return Math.pow(a, b);
    }

    public static double sqrt(double a) {
        if (a < 0) {
            System.out.println("Ошибка: отрицательное число");
            return 0;
        }
        return Math.sqrt(a);
    }

    public static double percent(double a, double b) {
        return (a * b) / 100;
    }

    // безопасный ввод
    public static double inputDouble() {
        while (!sc.hasNextDouble()) {
            System.out.println("Введите число!");
            sc.next();
        }
        return sc.nextDouble();
    }

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n=== КАЛЬКУЛЯТОР ===");
            System.out.println("1 +");
            System.out.println("2 -");
            System.out.println("3 *");
            System.out.println("4 /");
            System.out.println("5 степень");
            System.out.println("6 sqrt");
            System.out.println("7 процент");
            System.out.println("8 sin");
            System.out.println("9 cos");
            System.out.println("10 tan");
            System.out.println("11 история");
            System.out.println("0 выход");

            int choice;
            if (!sc.hasNextInt()) {
                System.out.println("Ошибка ввода!");
                sc.next();
                continue;
            }
            choice = sc.nextInt();

            if (choice == 0) break;

            double a, b, result = 0;
            String record = "";

            switch (choice) {

                case 1:
                    System.out.print("a: ");
                    a = inputDouble();
                    System.out.print("b: ");
                    b = inputDouble();
                    result = add(a, b);
                    record = a + " + " + b + " = " + result;
                    break;

                case 2:
                    a = inputDouble();
                    b = inputDouble();
                    result = sub(a, b);
                    record = a + " - " + b + " = " + result;
                    break;

                case 3:
                    a = inputDouble();
                    b = inputDouble();
                    result = mul(a, b);
                    record = a + " * " + b + " = " + result;
                    break;

                case 4:
                    a = inputDouble();
                    b = inputDouble();
                    result = div(a, b);
                    record = a + " / " + b + " = " + result;
                    break;

                case 5:
                    a = inputDouble();
                    b = inputDouble();
                    result = power(a, b);
                    record = a + "^" + b + " = " + result;
                    break;

                case 6:
                    a = inputDouble();
                    result = sqrt(a);
                    record = "sqrt(" + a + ") = " + result;
                    break;

                case 7:
                    a = inputDouble();
                    b = inputDouble();
                    result = percent(a, b);
                    record = a + "% от " + b + " = " + result;
                    break;

                case 8:
                    a = inputDouble();
                    result = Math.sin(a);
                    record = "sin(" + a + ") = " + result;
                    break;

                case 9:
                    a = inputDouble();
                    result = Math.cos(a);
                    record = "cos(" + a + ") = " + result;
                    break;

                case 10:
                    a = inputDouble();
                    result = Math.tan(a);
                    record = "tan(" + a + ") = " + result;
                    break;

                case 11:
                    System.out.println("История:");
                    for (String s : history)
                        System.out.println(s);
                    continue;

                default:
                    System.out.println("Неверный выбор");
                    continue;
            }

            System.out.println("Результат: " + result);
            history.add(record);

            // очистка экрана (имитация)
            for (int i = 0; i < 5; i++) System.out.println();
        }

        System.out.println("Выход...");
    }
}