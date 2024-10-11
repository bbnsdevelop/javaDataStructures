package br.com.bbnsdevelop.arrays;

import java.util.Arrays;

public class Array {
    
    public static void main(String[] args) {
        int[] intArray;
        intArray = new int[3];
        intArray[0] = 10;
        intArray[1] = 15;
        intArray[2] = 20;

        System.out.println(Arrays.toString(intArray));

        // or instatiation when create the variable 
        String[] stringArray = {"A", "b", "c"};

        System.out.println(Arrays.toString(stringArray));
    }
}
