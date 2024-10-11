package br.com.bbnsdevelop.arrays;

import java.util.Arrays;

public class OrderArray {
    

    public static void main(String[] args) {
        

        int[] numbers = {1,5,12,6,8,10,9,7,3,2,4,11};

        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

        int[]  numbers1 = {1,5,12,6,8,10,9,7,3,2,4,11};
        int x = numbers1.length;
        for (int i = 0; i < x ; i++) {
            for(int j = 0; j < x - 1; j++){
                if(numbers1[j] > numbers1[j +1]){
                    int temp = numbers1[j];
                    numbers1[j] = numbers1[j +1];
                    numbers1[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers1));

        int[]  numbers2 = {1,5,12,6,8,10,9,15,7,3,2,4,16,11,-1,0};
        int length = numbers2.length;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < (length - 1); j++){
                int currentNumer = numbers2[j];
                int nextNumber = numbers2[j + 1];
                if(currentNumer > nextNumber){                    
                    numbers2[j] = nextNumber;
                    numbers2[j + 1] = currentNumer;
                }
            }
        }

        System.out.println(Arrays.toString(numbers2));

    }
}
