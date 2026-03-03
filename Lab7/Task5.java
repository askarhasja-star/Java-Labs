import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] D = new int[17];
        int sum = 0;

        System.out.println("Введите 17 целых чисел:");

        for (int i = 0; i < 17; i++) {

            while (!sc.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число:");
                sc.next(); 
            }

            D[i] = sc.nextInt();
            sum += D[i];
        }

        double average = (double) sum / 17;
        System.out.println("Среднее = " + average);
    }
}