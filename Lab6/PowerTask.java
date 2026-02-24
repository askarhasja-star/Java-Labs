import java.util.Scanner;

public class PowerTask {

    public static long power(int base, int exponent) {

        if (exponent < 0) {
            System.out.println("Отрицательная степень не поддерживается.");
            return -1;
        }

        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите основание: ");
        if (!sc.hasNextInt()) {
            System.out.println("Ошибка: введите целое число!");
            return;
        }
        int base = sc.nextInt();

        System.out.print("Введите степень: ");
        if (!sc.hasNextInt()) {
            System.out.println("Ошибка: введите целое число!");
            return;
        }
        int exponent = sc.nextInt();

        long result = power(base, exponent);

        if (result != -1) {
            System.out.println(base + " в степени " + exponent + " = " + result);
        }
    }
}