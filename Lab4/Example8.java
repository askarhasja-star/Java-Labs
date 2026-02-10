import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        if (temp < 10) {
            System.out.println("Холодно");
        } else if (temp <= 25) {
            System.out.println("Тепло");
        } else {
            System.out.println("Жарко");
        }
    }
}