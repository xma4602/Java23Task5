package com.xma.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        do {
            text = scanner.nextLine();
            System.out.println(Transliteration.translateRusToEng(text));
        }
        while (!text.isEmpty());
    }
}
