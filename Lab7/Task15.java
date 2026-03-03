import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][5];

        System.out.println("Введите 15 чисел меньше 10:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                while (!sc.hasNextInt()) {
                    System.out.println("Ошибка! Введите число:");
                    sc.next();
                }

                int value = sc.nextInt();

                if (value >= 10) {
                    System.out.println("Число должно быть < 10. Повторите ввод:");
                    j--;
                    continue;
                }

                a[i][j] = value;
            }
        }

        System.out.println("Таблица:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}