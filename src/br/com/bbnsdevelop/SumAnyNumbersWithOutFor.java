package br.com.bbnsdevelop;

public class SumAnyNumbersWithOutFor {
    
    static int s = 0;
    
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
		int n = a.length;
		int sum = sum(a, n);
		System.out.println(sum);
    }

	public static int sum(int[] a, int n) {
		
		if(n == 0){
			return s;
		}
		s += a[n -1];
		
		return sum(a, (n-1));

	}
}
