import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] A = new int[10][10];
        int[] B = new int[10];

        System.out.println("Введите 100 целых чисел для массива 10x10:");

        for (int i = 0; i < 10; i++) {
            int sum = 0;

            for (int j = 0; j < 10; j++) {

                while (!sc.hasNextInt()) {
                    System.out.println("Ошибка! Введите целое число:");
                    sc.next();
                }

                A[i][j] = sc.nextInt();

                if (A[i][j] < 0)
                    sum += A[i][j];
            }

            B[i] = sum;
        }

        System.out.println("Суммы отрицательных по строкам:");
        for (int i = 0; i < 10; i++)
            System.out.println("Строка " + i + ": " + B[i]);
    }
}