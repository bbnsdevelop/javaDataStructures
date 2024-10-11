package br.com.bbnsdevelop.arrays;

public class Man {
    
    public static void main(String[] args) {
        SingleDimensionArray single = new SingleDimensionArray(10);

        single.insert(0, 5);
        single.insert(0, 5);
        single.insert(1, 10);
        single.insert(2, 14);
        single.insert(3, 15);
        single.insert(4, 17);
        single.insert(5, 19);
        single.insert(10, 30);
        
        //single.show();
        
        int value = single.getValueByIndex(5);
        System.out.println(value);
        
        
        single.traversalArray();
    }
}
