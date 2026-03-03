import java.util.Scanner;
import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] B = new int[25];

        System.out.println("Введите 25 целых чисел:");

        for (int i = 0; i < 25; i++) {

            while (!sc.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число:");
                sc.next();
            }

            B[i] = sc.nextInt();
        }

        Arrays.sort(B);

        System.out.println("Отсортированный массив:");
        for (int i : B)
            System.out.print(i + " ");
    }
}