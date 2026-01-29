package com.practice.arrays;

public class LargestElement {

    public static void main(String[] args){

        int[] array = {1,2,5,3,7,9};
        int largest = 0;

        for (int i=0; i<array.length; i++){

            if(array[i] > largest){
                largest = array[i];
            }
        }

        System.out.println("Largest element is " + largest);
    }
}
