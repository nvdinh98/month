package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int month ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap month di ban oi !!!");
        month = scanner.nextInt();

        switch (month) {
            case 2 :
                System.out.println("co 28 hoac 29 ngay");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("co 30 ngay ");
                break;
        }
    }
}
