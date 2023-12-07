package com.mycompany.valuechange;

import java.util.Scanner;

public class ValueChange {

    public static void main(String[] args) {
        int S1;
        int S2;
        int S3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Sayının Değerini Giriniz: ");
        S1 = scanner.nextInt();
        System.out.println("2.Sayının Değeriniz Giriniz: ");
        S2 = scanner.nextInt();
        
        S3 = S1;
        S1 = S2;
        S2 = S3;
        
        System.out.println("1.Sayı: " + S1);
        System.out.println("2.Sayı: " + S2);
    }
}
