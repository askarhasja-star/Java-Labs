import java.util.Scanner;

public class Extra4_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в Цельсиях: ");
        double c = scanner.nextDouble();

        double f = c * 9 / 5 + 32;

        System.out.println("Температура в Фаренгейтах: " + f);
    }
}