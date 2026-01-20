package com.example;

public class SubjectInfo {
    public static void main(String[] args) {
        String subjectName = "Программирование на Java";
        String teachers = "Иванов И.И., Петров П.П.";
        String department = "Кафедра информационных технологий";
        int hours = 120;

        System.out.println("=== Информация о предмете ===");
        System.out.println("Название предмета: " + subjectName);
        System.out.println("Преподаватели: " + teachers);
        System.out.println("Кафедра: " + department);
        System.out.println("Количество часов: " + hours);
    }
}
