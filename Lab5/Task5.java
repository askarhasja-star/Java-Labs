import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;

        do {
            System.out.print("Введите число (0 для выхода): ");

            if (!sc.hasNextInt()) {
                System.out.println("Ошибка: введите целое число!");
                sc.next(); // очищаем неправильный ввод
                continue;
            }

            num = sc.nextInt();
            sum += num;

        } while (num != 0);

        System.out.println("Сумма введённых чисел = " + sum);
    }
}