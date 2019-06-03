package com.huangjie;

import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you name:");
        String name = scanner.nextLine();
        System.out.println("Please enter you favor:");
        String favor = scanner.nextLine();
        System.out.println("Please enter you age:");
        int age = scanner.nextInt();

        System.out.println(name);
        System.out.println(favor);
        System.out.println(age);
    }
}
