package com.jano;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int counter = 1;

        StringBuilder output = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] arr = input.toCharArray();
        char temp = arr[0];

        for (int i = 1; i < input.length(); i++) {
            if (temp == arr[i]) {
                counter++;
            }
            if (temp != arr[i]) {
                output.append(temp).append(counter);
                counter = 1;
            }
            temp = arr[i];
        }
        output.append(temp).append(counter);
        System.out.println(output);
    }
}
