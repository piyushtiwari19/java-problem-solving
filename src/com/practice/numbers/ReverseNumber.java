package com.practice.numbers;

public class ReverseNumber {

    public static void main(String[] args){

        int num = 1234;
        int reversed = 0;

        while(num != 0){
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }

        System.out.println("1234 Reversed number is " + reversed);

        int num1 = 54673;
        String reverse = new StringBuilder(String.valueOf(num1))
                .reverse()
                .toString();

        System.out.println("Using reverse method 54673 reverse number is " + reverse);
    }
}
