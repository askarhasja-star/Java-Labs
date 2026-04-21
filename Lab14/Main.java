import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 9
        System.out.println("\nЗадание 1:");
System.out.print("Введите N: ");
int N = sc.nextInt();

int s = 0, x = 1;

do {
    System.out.print(x + " "); 
    s += x;
    x++;
} while (x <= N);

System.out.println("\nСумма: " + s);

        // 10
        System.out.println("\nЗадание 2:");
        System.out.print("Введите число: ");
        int cNum = sc.nextInt();
        int count = 0;
        do {
            count++;
            cNum /= 1000;
        } while (cNum > 0);
        System.out.println("Количество цифр: " + count);

        // 11
        System.out.println("\nЗадание 3:");
        System.out.print("Введите число: ");
        int t = sc.nextInt();
        int z = 1;
        do {
            System.out.println(t + " * " + z + " = " + (t * z));
            z++;
        } while (z <= 10);

        // 12
        System.out.println("\nЗадание 4:");
        System.out.print("Введите число: ");
        int maxNum = sc.nextInt();
        int maxDigit = 0;
        do {
            int d = maxNum % 10;
            if (d > maxDigit) maxDigit = d;
            maxNum /= 10;
        } while (maxNum > 0);
        System.out.println("Макс цифра: " + maxDigit);

        // 13
        System.out.println("\nЗадание 5:");
        System.out.print("Введите число: ");
        int p = sc.nextInt();
        int orig = p, rev = 0;
        do {
            rev = rev * 10 + p % 10;
            p /= 10;
            System.out.print(p + " ");
        } while (p > 0);
        System.out.println(orig == rev ? "Палиндром" : "Не палиндром");

        // 14
        System.out.println("\nЗадание 6:");
        System.out.print("Введите число: ");
        int evenNum = sc.nextInt();
        int evenCount = 0;
        do {
            if ((evenNum % 10) % 2 == 0) evenCount++;
            evenNum /= 10;
        } while (evenNum > 0);
        System.out.println("Чётных цифр: " + evenCount);

        // 7
        System.out.println("\nЗадание 7:");
        Random rand = new Random();
        int r;
        do {
            r = rand.nextInt(10);
            System.out.println(r);
        } while (r != 0);

        // 8
        System.out.println("\nЗадание 8:");
        int sumInput = 0, val;
        do {
            System.out.print("Введите число (0 для выхода): ");
            val = sc.nextInt();
            sumInput += val;
        } while (val != 0);
        System.out.println("Сумма: " + sumInput);

        sc.nextLine();

        // 9
        System.out.println("\nЗадание 9:");
        String pass;
        do {
            System.out.print("Введите пароль (>=6): ");
            pass = sc.nextLine();
        } while (pass.length() < 6);
        System.out.println("Принято");

        // 10
        System.out.println("\nЗадание 10:");
        int minVal = Integer.MAX_VALUE;
        int inputNum;
        do {
            System.out.print("Введите число (0 для выхода): ");
            inputNum = sc.nextInt();
            if (inputNum != 0 && inputNum < minVal) {
                minVal = inputNum;
            }
        } while (inputNum != 0);
        System.out.println("Минимум: " + minVal);
    }
}