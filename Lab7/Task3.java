import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] A = new double[12];
        double product = 1;
        boolean found = false;

        System.out.println("Введите 12 вещественных чисел:");

        for (int i = 0; i < 12; i++) {

            while (!sc.hasNextDouble()) {
                System.out.println("Ошибка! Введите число:");
                sc.next();
            }

            A[i] = sc.nextDouble();

            if (A[i] < 0) {
                product *= A[i];
                found = true;
            }
        }

        if (found)
            System.out.println("Произведение отрицательных = " + product);
        else
            System.out.println("Отрицательных элементов нет");
    }
}