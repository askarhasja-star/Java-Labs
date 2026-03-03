import java.util.Scanner;

public class Task16 {

    public static int maxX(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        System.out.println("Введите 10 целых чисел:");

        for (int i = 0; i < 10; i++) {
            while (!sc.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число:");
                sc.next();
            }
            array[i] = sc.nextInt();
        }

        System.out.println("Максимальный элемент = " + maxX(array));
    }
}