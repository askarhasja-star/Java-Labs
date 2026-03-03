import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] D = new int[7][7];
        int sum = 0;

        System.out.println("Введите 49 целых чисел:");

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {

                while (!sc.hasNextInt()) {
                    System.out.println("Ошибка! Введите целое число:");
                    sc.next();
                }

                D[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 7; i++)
            sum += D[i][i];

        System.out.println("Среднее диагонали = " + (double) sum / 7);
    }
}