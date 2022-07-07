package Recap;

public class Recap {

	public static void main(String[] args) {

		int[] numbers = { 23, 56, 73, 16, 80, 70, 39 };

		int largest=numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] > largest) {
				largest= numbers[i];
				
				
			}
		}
		System.out.println(largest);
	}
}