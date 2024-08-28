package Basics;

import java.text.NumberFormat;
import java.util.Arrays;

public class BasicDS {

    public static void strings() {
        String message = "Hello World!";
        char result = message.charAt(4);
        System.out.println(message.indexOf('o'));
        System.out.println(message.replace('l','#'));
        System.out.println(result);
    }

    public static void arrays() {
        int[] numbers = new int[5];
        numbers[0]=1;
        numbers[1]=-1;
        System.out.println(Arrays.toString(numbers));
    }

    public static void constants(){
        double result = (double) 10/ (double) 3;
        System.out.println(result);
    }

    public static void numberFormat() {
        NumberFormat percent = NumberFormat.getPercentInstance();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String salary = currency.format(12345600.33);
        String score = percent.format(0.1);
        System.out.println(salary);
        System.out.println(score);
    }

    public static void main(String[] args) {
        strings();
        arrays();
        constants();
        numberFormat();
    }
}