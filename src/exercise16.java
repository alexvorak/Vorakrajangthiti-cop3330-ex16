/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */


import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args){

        System.out.print("What is your age? ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        int userage = Integer.parseInt(password);
        if (userage < 16) {
            System.out.printf("You are not old enough to legally drive.");
        }
        else {
            System.out.printf("You are old enough to legally drive.");
        }
    }
}
