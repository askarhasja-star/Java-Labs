import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] C = new int[5][5];
        int product = 1;
        boolean found = false;

        System.out.println("Введите 25 целых чисел для массива 5x5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                while (!sc.hasNextInt()) {
                    System.out.println("Ошибка! Введите целое число:");
                    sc.next();
                }

                C[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            if (C[i][i] > 0) {
                product *= C[i][i];
                found = true;
            }
        }

        if (found)
            System.out.println("Произведение положительных диагонали = " + product);
        else
            System.out.println("Положительных элементов на диагонали нет");
    }
}