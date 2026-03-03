import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите s1:");
        String s1 = sc.nextLine();

        System.out.println("Введите s2:");
        String s2 = sc.nextLine();

        System.out.println("Введите s3:");
        String s3 = sc.nextLine();

        System.out.println("Введите s4:");
        String s4 = sc.nextLine();

        System.out.println("Введите s5:");
        String s5 = sc.nextLine();

        if (s4.equals(s5))
            System.out.println("Результат: " + s1 + s2);
        else
            System.out.println("Результат: " + s1 + s3);
    }
}