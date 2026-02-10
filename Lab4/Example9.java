import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 10 && num <= 50) {
            System.out.println("Число в диапазоне");
        } else {
            System.out.println("Число вне диапазона");
        }
    }
}