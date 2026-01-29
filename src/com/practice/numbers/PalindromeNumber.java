package com.practice.numbers;

public class PalindromeNumber {

    public static void main(String[] args){

        int num = 124321;
        int temp = num;
        int reversed = 0;

        while(num != 0){

            reversed = reversed * 10 + (num % 10);
            num = num / 10;
        }

        if (temp == reversed){

            System.out.println("Palindrome number " + temp);
        }else {

            System.out.println("Not a Palindrome number " + temp);
        }
    }
}
