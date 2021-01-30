package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Программа переводит число из 10-ой системы в 16-ю");
        while (true) {
            int nb = scanner.nextByte();

            if (nb >= 0 && nb < 16) {
                System.out.println(base(nb));
                return;
            } else {
                System.out.println("Вы ввели некорректное число. Пожалуйста введите число от 0 - 15");
            }
        }

    }

    public static String base(int nb) {
        HashMap<Integer, String> tableOfNumbers = new HashMap<>();

        tableOfNumbers.put(0, "0");
        tableOfNumbers.put(1, "1");
        tableOfNumbers.put(2, "2");
        tableOfNumbers.put(3, "3");
        tableOfNumbers.put(4, "4");
        tableOfNumbers.put(5, "5");
        tableOfNumbers.put(6, "6");
        tableOfNumbers.put(7, "7");
        tableOfNumbers.put(8, "8");
        tableOfNumbers.put(9, "9");
        tableOfNumbers.put(10, "A");
        tableOfNumbers.put(11, "B");
        tableOfNumbers.put(12, "C");
        tableOfNumbers.put(13, "D");
        tableOfNumbers.put(14, "E");
        tableOfNumbers.put(15, "F");
        String result = tableOfNumbers.get(nb);
        return result;
    }
}
