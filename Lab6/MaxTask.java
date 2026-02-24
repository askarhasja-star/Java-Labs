public class MaxTask {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {

        int intResult = max(10, 25);
        double doubleResult = max(5.7, 3.2);

        System.out.println("Максимум (int): " + intResult);
        System.out.println("Максимум (double): " + doubleResult);
    }
}