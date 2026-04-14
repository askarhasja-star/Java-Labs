import java.util.; import java.util.function.; import java.util.stream.*;

class Student { String name; int age; double grade;

Student(String name, int age, double grade) {
    this.name = name;
    this.age = age;
    this.grade = grade;
}

public String toString() {
    return name + " " + age + " " + grade;
}

}

class Order { String name; double price;

Order(String name, double price) {
    this.name = name;
    this.price = price;
}

public String toString() {
    return name + " " + price;
}

}

public class Main { public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

    // Ввод чисел
    System.out.print("Сколько чисел ввести: ");
    int n = sc.nextInt();
    List<Integer> numbers = new ArrayList<>();

    System.out.println("Введите числа:");
    for (int i = 0; i < n; i++) {
        numbers.add(sc.nextInt());
    }

    sc.nextLine();

    // Ввод строк
    System.out.print("Сколько строк ввести: ");
    int m = sc.nextInt();
    sc.nextLine();
    List<String> words = new ArrayList<>();

    System.out.println("Введите строки:");
    for (int i = 0; i < m; i++) {
        words.add(sc.nextLine());
    }

    // 1
    BinaryOperator<Integer> sum = (a, b) -> a + b;
    System.out.println("1: " + sum.apply(5, 3));

    // 2
    Function<String, String> upper = s -> s.toUpperCase();
    System.out.println("2: " + upper.apply(words.get(0)));

    // 3
    numbers.stream().filter(x -> x % 2 != 0).forEach(System.out::println);

    // 4
    numbers.stream().map(x -> x * x).forEach(System.out::println);

    // 5
    int max = numbers.stream().max(Integer::compare).orElse(0);
    System.out.println("5: " + max);

    // 6
    words.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    // 7
    words.stream().map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
            .forEach(System.out::println);

    // 8
    words.stream().filter(s -> s.length() > 5).forEach(System.out::println);

    // 9
    numbers.forEach(System.out::println);

    // 10
    int min = numbers.stream().min(Integer::compare).orElse(0);
    System.out.println("10: " + min);

    // 11
    Consumer<String> printer = s -> System.out.println(s);
    printer.accept("Пример Consumer");

    // 12
    Supplier<Integer> random = () -> new Random().nextInt(100);
    System.out.println("12: " + random.get());

    // Ввод студентов
    System.out.print("Сколько студентов: ");
    int k = sc.nextInt();
    sc.nextLine();

    List<Student> students = new ArrayList<>();

    for (int i = 0; i < k; i++) {
        System.out.print("Имя: ");
        String name = sc.nextLine();
        System.out.print("Возраст: ");
        int age = sc.nextInt();
        System.out.print("Оценка: ");
        double grade = sc.nextDouble();
        sc.nextLine();

        students.add(new Student(name, age, grade));
    }

    // 13
    students.stream().sorted(Comparator.comparing(s -> s.age)).forEach(System.out::println);

    // 14
    students.stream()
            .filter(s -> s.grade > 80)
            .sorted(Comparator.comparing(s -> s.name))
            .forEach(System.out::println);

    // 15
    numbers.stream()
            .filter(x -> x > 5)
            .map(x -> x * 2)
            .sorted()
            .forEach(System.out::println);

    // 16
    Map<Integer, List<Student>> grouped = students.stream()
            .collect(Collectors.groupingBy(s -> s.age));
    System.out.println(grouped);

    // 17
    int total = numbers.stream().reduce(0, Integer::sum);
    System.out.println("17: " + total);

    // 18
    numbers.stream().distinct().limit(3).forEach(System.out::println);

    // 19
    List<List<Integer>> nested = new ArrayList<>();
    nested.add(numbers);
    nested.add(Arrays.asList(100, 200));

    nested.stream().flatMap(list -> list.stream()).forEach(System.out::println);

    // Ввод заказов
    System.out.print("Сколько заказов: ");
    int z = sc.nextInt();
    sc.nextLine();

    List<Order> orders = new ArrayList<>();

    for (int i = 0; i < z; i++) {
        System.out.print("Название: ");
        String name = sc.nextLine();
        System.out.print("Цена: ");
        double price = sc.nextDouble();
        sc.nextLine();

        orders.add(new Order(name, price));
    }

    // 20
    orders.stream()
            .filter(o -> o.price > 1000)
            .sorted(Comparator.comparing(o -> o.price))
            .forEach(System.out::println);
}

}