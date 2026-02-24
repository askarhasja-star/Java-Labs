import java.util.Scanner;

public class EvenTask {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        if (!sc.hasNextInt()) {
            System.out.println("Ошибка: введите целое число!");
            return;
        }

        int number = sc.nextInt();

        if (isEven(number)) {
            System.out.println("Число " + number + " является чётным.");
        } else {
            System.out.println("Число " + number + " является нечётным.");
        }
    }
}