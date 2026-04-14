import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String toString() {
        return name + " " + age + " " + grade;
    }
}

class Order {
    String name;
    double price;

    Order(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " " + price;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String> words = Arrays.asList("java","code","lambda","stream","hello");

        // 1
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println("1: " + sum.apply(5, 3));

        // 2
        Function<String, String> upper = s -> s.toUpperCase();
        System.out.println("2: " + upper.apply("java"));

        // 3
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 4
        numbers.stream()
                .map(n -> n * n)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        // 5
        int max = numbers.stream().max(Integer::compare).orElse(0);
        System.out.println("5: " + max);

        // 6
        words.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);

        // 7
        words.stream()
                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .forEach(System.out::println);

        // 8
        words.stream()
                .filter(s -> s.length() > 5)
                .forEach(System.out::println);

        // 9
        numbers.forEach(System.out::println);

        // 10
        List<Integer> empty = new ArrayList<>();
        int min = empty.stream().min(Integer::compare).orElse(0);
        System.out.println("10: " + min);

        // 11
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Hello");

        // 12
        Supplier<Integer> random = () -> new Random().nextInt(100);
        System.out.println("12: " + random.get());

        // 13
        List<Student> students = Arrays.asList(
                new Student("Ali",20,85),
                new Student("Bob",22,70),
                new Student("Zara",19,90)
        );

        students.stream()
                .sorted(Comparator.comparing(s -> s.age))
                .forEach(System.out::println);

        // 14
        students.stream()
                .filter(s -> s.grade > 80)
                .sorted(Comparator.comparing(s -> s.name))
                .forEach(System.out::println);

        // 15
        numbers.stream()
                .filter(n -> n > 5)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);

        // 16
        Map<Integer, List<Student>> grouped =
                students.stream().collect(Collectors.groupingBy(s -> s.age));
        System.out.println(grouped);

        // 17
        int total = numbers.stream().reduce(0, Integer::sum);
        System.out.println("17: " + total);

        // 18
        List<Integer> nums = Arrays.asList(1,2,2,3,3,4,5);
        nums.stream()
                .distinct()
                .limit(3)
                .forEach(System.out::println);

        // 19
        List<List<Integer>> nested = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4)
        );

        nested.stream()
                .flatMap(list -> list.stream())
                .forEach(System.out::println);

        // 20
        List<Order> orders = Arrays.asList(
                new Order("Phone",1500),
                new Order("Book",500),
                new Order("Laptop",3000)
        );

        orders.stream()
                .filter(o -> o.price > 1000)
                .sorted(Comparator.comparing(o -> o.price))
                .forEach(System.out::println);
    }
}