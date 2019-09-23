package com.company;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int enteredNum = in.nextInt();

        System.out.println(returnReverseNum(enteredNum));
    }

    public static int returnReverseNum (int enteredNum) {

        int reverseNum = ~enteredNum + 1;
        return reverseNum;
    }

}
