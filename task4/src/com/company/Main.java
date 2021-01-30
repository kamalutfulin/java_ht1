package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        System.out.println(toComparison(firstWord, secondWord));
    }


    public static String toComparison(String firstWord, String secondWord) {
        String resultPositive = "ОК";
        String resultNegative = "КО";
        char star = '*';
        int differenceNumberLetters = 0;
        if (firstWord.equals(secondWord)) {
            return resultPositive;
        } else if (secondWord.contains("*") == false) {
            return resultNegative;
        } else {
            StringBuilder sb = new StringBuilder(secondWord);
            differenceNumberLetters = firstWord.length() - secondWord.length();
            if (differenceNumberLetters > 0) {
                star = firstWord.charAt(secondWord.indexOf("*"));


                for (int i = 0; i < differenceNumberLetters; i++) {
                    sb.insert(sb.length(), star);
                }

            } else if (differenceNumberLetters < 0) {
                try {
                    star = firstWord.charAt(secondWord.indexOf("*"));
                    for (int i = secondWord.length() - 1; i >= firstWord.length(); i--) {
                        sb.deleteCharAt(i);
                    }
                } catch (Exception e) {
                    System.out.println("* должна стоять в рамках длинны 1-го слова");
                }
            } else if (differenceNumberLetters == 0) {
                star = firstWord.charAt(secondWord.indexOf("*"));


            }


            for (int i = 0; i < sb.length(); i++) {  // убирает во втором слове все первоначальные звездочки
                if (sb.charAt(i) == '*') {
                    sb.setCharAt(i, star);

                }
            }
            secondWord = sb.toString();
            return firstWord.equals(secondWord) ? resultPositive : resultNegative;
        }

    }
}
