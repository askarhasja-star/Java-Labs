import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] A = new int[25];

        System.out.println("Введите 25 целых чисел:");

        for (int i = 0; i < 25; i++) {

            while (!sc.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число:");
                sc.next();
            }

            A[i] = sc.nextInt();
        }

        int max = 0, min = 0;

        for (int i = 1; i < 25; i++) {
            if (A[i] > A[max]) max = i;
            if (A[i] < A[min]) min = i;
        }

        int temp = A[max];
        A[max] = A[min];
        A[min] = temp;

        System.out.println("После обмена:");
        for (int i = 0; i < 25; i++)
            System.out.print(A[i] + " ");
    }
}