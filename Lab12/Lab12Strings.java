import java.util.*;

public class Lab12Strings {

static Scanner scanner = new Scanner(System.in);

public static void main(String[] args) {
    System.out.print("Введите строку: ");
    String input = scanner.nextLine();

    // 1
    System.out.println("\n1. Длина строки: " + input.length());

    // 2
    System.out.println("2. Верхний регистр: " + input.toUpperCase());
    System.out.println("   Нижний регистр: " + input.toLowerCase());

    // 3
    String[] words = input.trim().split("\\s+");
    System.out.println("3. Количество слов: " + words.length);

    // 4
    System.out.println("4. Слова в обратном виде:");
    for (String word : words) {
        System.out.print(new StringBuilder(word).reverse() + " ");
    }
    System.out.println();

    // 5
    System.out.print("5. Введите слово для поиска: ");
    String search = scanner.nextLine();
    System.out.println("Содержится? " + input.contains(search));

    // 6
    System.out.print("6. Что заменить: ");
    String oldWord = scanner.nextLine();
    System.out.print("   На что заменить: ");
    String newWord = scanner.nextLine();
    System.out.println("Результат: " + input.replace(oldWord, newWord));

    // 7
    String clean = input.replaceAll("\\s+", "").toLowerCase();
    String reversed = new StringBuilder(clean).reverse().toString();
    System.out.println("7. Палиндром? " + clean.equals(reversed));

    // 8
    System.out.print("8. Введите вторую строку: ");
    String second = scanner.nextLine();
    System.out.println("Равны? " + input.equals(second));

    // 9
    System.out.print("9. Введите разделитель: ");
    String delim = scanner.nextLine();
    String[] parts = input.split(delim);
    System.out.println("Результат разделения:");
    for (String p : parts) {
        System.out.println(p);
    }

    // 10
    int vowels = 0, consonants = 0;
    String letters = input.toLowerCase();
    for (char c : letters.toCharArray()) {
        if (Character.isLetter(c)) {
            if ("aeiouyаеёиоуыэюя".indexOf(c) != -1) vowels++;
            else consonants++;
        }
    }
    System.out.println("10. Гласные: " + vowels + ", согласные: " + consonants);

    // 11
    System.out.println("11. Без пробелов: " + input.replace(" ", ""));

    // 12
    String longest = "";
    for (String w : words) {
        if (w.length() > longest.length()) longest = w;
    }
    System.out.println("12. Самое длинное слово: " + longest);

    // 13
    int countNoSpaces = input.replace(" ", "").length();
    System.out.println("13. Символов без пробелов: " + countNoSpaces);

    // 14
    System.out.print("14. Начинается с слова: ");
    String start = scanner.nextLine();
    System.out.println(input.startsWith(start));

    // 15
    System.out.print("15. Заканчивается символом: ");
    String end = scanner.nextLine();
    System.out.println(input.endsWith(end));

    // 16
    System.out.println("16. Полностью наоборот: " + new StringBuilder(input).reverse());

    // 17
    System.out.println("17. Без цифр: " + input.replaceAll("\\d", ""));

    // 18
    System.out.println("18. Гласные заменены: " + input.replaceAll("(?i)[aeiouyаеёиоуыэюя]", "*"));

    // 19
    System.out.println("19. Частота символов:");
    Map<Character, Integer> map = new HashMap<>();
    for (char c : input.toCharArray()) {
        map.put(c, map.getOrDefault(c, 0) + 1);
    }
    for (Map.Entry<Character, Integer> e : map.entrySet()) {
        System.out.println(e.getKey() + ": " + e.getValue());
    }

    // 20
    System.out.println("20. Только цифры? " + input.matches("\\d+"));
}

}