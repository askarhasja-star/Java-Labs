import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        if (month == 2) {
            System.out.println("28 дней");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 дней");
        } else if (month >= 1 && month <= 12) {
            System.out.println("31 день");
        } else {
            System.out.println("Неверный номер месяца");
        }
    }
}