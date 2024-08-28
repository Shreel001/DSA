package Basics;

import java.util.Scanner;

public class MortgageCalculator {
    public static void mortgageCalculator() {
        Scanner Principal = new Scanner(System.in);
        System.out.print("Principal:");
        int p = Principal.nextInt();

        Scanner interest = new Scanner(System.in);
        System.out.print("Interest:");
        float annualInterest = interest.nextFloat()/100;
        float r = annualInterest/12;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Period:");
        int n = scanner.nextInt() * 12;

        double mortgage = ((p * r)*(Math.pow(1+r,n)))/((Math.pow(1+r,n))-1);
        System.out.println(mortgage);
    }

    public static void main(String[] args) {
        mortgageCalculator();
    }
}


//Principal = 100000
//Interestate = 3.92
//Period = 30 years
// Mortgage = 472.81
