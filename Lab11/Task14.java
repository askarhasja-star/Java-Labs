import java.util.*;

public class Task14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите выражение (например: 2 + 3 * 4):");

        String input = sc.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Ошибка: пустой ввод");
            return;
        }

        String[] tokens = input.split(" ");

        // проверка формата
        if (tokens.length % 2 == 0) {
            System.out.println("Ошибка: неправильный формат");
            return;
        }

        ArrayList<Double> numbers = new ArrayList<>();
        ArrayList<String> ops = new ArrayList<>();

        try {
            for (int i = 0; i < tokens.length; i++) {

                if (i % 2 == 0) {
                    numbers.add(Double.parseDouble(tokens[i]));
                } else {
                    if (!tokens[i].matches("[+\\-*/]")) {
                        System.out.println("Ошибка: неизвестная операция " + tokens[i]);
                        return;
                    }
                    ops.add(tokens[i]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не число");
            return;
        }

        // сначала * и /
        for (int i = 0; i < ops.size(); i++) {

            String op = ops.get(i);

            if (op.equals("*") || op.equals("/")) {

                double a = numbers.get(i);
                double b = numbers.get(i + 1);
                double res;

                if (op.equals("*")) {
                    res = a * b;
                } else {
                    if (b == 0) {
                        System.out.println("Ошибка: деление на ноль");
                        return;
                    }
                    res = a / b;
                }

                numbers.set(i, res);
                numbers.remove(i + 1);
                ops.remove(i);
                i--;
            }
        }

        // потом + и -
        double result = numbers.get(0);

        for (int i = 0; i < ops.size(); i++) {

            String op = ops.get(i);

            if (op.equals("+")) {
                result += numbers.get(i + 1);
            } else {
                result -= numbers.get(i + 1);
            }
        }

        System.out.println("Результат: " + result);
    }
}