import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1
        System.out.println("\nЗадание 1:");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println();

        // 2
        System.out.println("\nЗадание 2:");
        int num;
        do {
            System.out.print("Введите положительное число: ");
            num = sc.nextInt();
        } while (num <= 0);

        // 3
        System.out.println("\nЗадание 3:");
        System.out.print("Введите число: ");
        int number = sc.nextInt();
        int sum = 0;
        do {
            sum += number % 10;
            number /= 10;
        } while (number > 0);
        System.out.println("Сумма цифр: " + sum);

        sc.nextLine();

        // 4
        System.out.println("\nЗадание 4:");
        String password = "12345";
        String input;
        do {
            System.out.print("Введите пароль: ");
            input = sc.nextLine();
        } while (!input.equals(password));
        System.out.println("Доступ разрешён!");

        // 5
        System.out.println("\nЗадание 5:");
        System.out.print("Введите число: ");
        int n = sc.nextInt();
        int fact = 1;
        int j = 1;
        do {
            fact *= j;
            j++;
        } while (j <= n);
        System.out.println("Факториал: " + fact);

        sc.nextLine();

        // 6
        System.out.println("\nЗадание 6:");
        String choice;
        do {
            System.out.println("Работаем...");
            System.out.print("Продолжить? (yes/no): ");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        // 7
        System.out.println("\nЗадание 7:");
        do {
            System.out.print("Введите a: ");
            int a = sc.nextInt();
            System.out.print("Введите b: ");
            int b = sc.nextInt();
            System.out.println("Сумма: " + (a + b));

            sc.nextLine();
            System.out.print("Продолжить? (yes/no): ");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("yes"));

        // 8
        System.out.println("\nЗадание 8:");
        int evenSum = 0;
        int k = 2;
        do {
            evenSum += k;
            k += 2;
        } while (k <= 100);
        System.out.println("Сумма чётных: " + evenSum);

        // -------- ДОПОЛНИТЕЛЬНЫЕ --------

        // 9
        System.out.println("\nЗадание 9:");
        System.out.print("Введите N: ");
        int N = sc.nextInt();
        int s = 0, x = 1;
        do {
            s += x;
            x++;
        } while (x <= N);
        System.out.println("Сумма: " + s);

        // 10
        System.out.println("\nЗадание 10:");
        System.out.print("Введите число: ");
        int cNum = sc.nextInt();
        int count = 0;
        do {
            count++;
            cNum /= 10;
        } while (cNum > 0);
        System.out.println("Количество цифр: " + count);

        // 11
        System.out.println("\nЗадание 11:");
        System.out.print("Введите число: ");
        int t = sc.nextInt();
        int z = 1;
        do {
            System.out.println(t + " * " + z + " = " + (t * z));
            z++;
        } while (z <= 10);

        // 12
        System.out.println("\nЗадание 12:");
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
        System.out.println("\nЗадание 13:");
        System.out.print("Введите число: ");
        int p = sc.nextInt();
        int orig = p, rev = 0;
        do {
            rev = rev * 10 + p % 10;
            p /= 10;
        } while (p > 0);
        System.out.println(orig == rev ? "Палиндром" : "Не палиндром");

        // 14
        System.out.println("\nЗадание 14:");
        System.out.print("Введите число: ");
        int evenNum = sc.nextInt();
        int evenCount = 0;
        do {
            if ((evenNum % 10) % 2 == 0) evenCount++;
            evenNum /= 10;
        } while (evenNum > 0);
        System.out.println("Чётных цифр: " + evenCount);

        // 15
        System.out.println("\nЗадание 15:");
        Random rand = new Random();
        int r;
        do {
            r = rand.nextInt(10);
            System.out.println(r);
        } while (r != 0);

        // 16
        System.out.println("\nЗадание 16:");
        int sumInput = 0, val;
        do {
            System.out.print("Введите число (0 для выхода): ");
            val = sc.nextInt();
            sumInput += val;
        } while (val != 0);
        System.out.println("Сумма: " + sumInput);

        sc.nextLine();

        // 17
        System.out.println("\nЗадание 17:");
        String pass;
        do {
            System.out.print("Введите пароль (>=6): ");
            pass = sc.nextLine();
        } while (pass.length() < 6);
        System.out.println("Принято");

        // 18
        System.out.println("\nЗадание 18:");
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