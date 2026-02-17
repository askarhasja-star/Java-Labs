import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0; 
        int sum = 0;

        do {
            System.out.print("Введите число (0 для выхода): ");

            if (!sc.hasNextInt()) {
                System.out.println("Ошибка: введите целое число!");
                sc.next();
                continue;
            }

            num = sc.nextInt();
            sum += num;

        } while (num != 0);

        System.out.println("Сумма введённых чисел = " + sum);
    }
}