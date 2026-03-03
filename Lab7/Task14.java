import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] D = new int[30];
        int even = 0, odd = 0;

        System.out.println("Введите 30 целых чисел:");

        for (int i = 0; i < 30; i++) {

            while (!sc.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число:");
                sc.next();
            }

            D[i] = sc.nextInt();

            if (D[i] % 2 == 0)
                even += D[i];
            else
                odd += D[i];
        }

        System.out.println("Сумма чётных = " + even);
        System.out.println("Сумма нечётных = " + odd);
    }
}