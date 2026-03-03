import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] A = new int[12][6];

        System.out.println("Введите 72 целых числа:");

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {

                while (!sc.hasNextInt()) {
                    System.out.println("Ошибка! Введите целое число:");
                    sc.next();
                }

                A[i][j] = sc.nextInt();
            }
        }

        for (int j = 0; j < 6; j++) {
            int product = 1;
            boolean found = false;

            for (int i = 0; i < 12; i++) {
                if (A[i][j] < 0) {
                    product *= A[i][j];
                    found = true;
                }
            }

            if (found)
                System.out.println("Столбец " + j + ": " + product);
            else
                System.out.println("Столбец " + j + ": отрицательных нет");
        }
    }
}