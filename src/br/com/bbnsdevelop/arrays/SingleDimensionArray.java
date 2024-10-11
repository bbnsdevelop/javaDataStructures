package br.com.bbnsdevelop.arrays;

import java.util.Arrays;

public class SingleDimensionArray {
    private int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        setMinimumValue(arr);
    }

    private void setMinimumValue(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int value) {

        try {

            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = value;
                System.out.println("Sucessfully inserted");
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inavlid index!");
        }
    }

    public void show(){
        System.out.println(Arrays.toString(arr));
    }

    public int getValueByIndex(int index){
        try{
            return arr[index];        
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inavlid index!");
            return 0;
        }
    }

    public void traversalArray(){
        try {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] ==  Integer.MIN_VALUE){
                    continue;
                }
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Array no longer exists!");
        }
    }

}
