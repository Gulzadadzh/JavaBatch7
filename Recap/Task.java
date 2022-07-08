package Recap;

public class Task {

	void larger(int a, int b) {
		if(a>b) {
			System.out.println(a+" is larger than "+b);
		}else {
			System.out.println(b+" is larger than "+a);

		}
	}
	
	void evenAndOdd(int n) {
		if (n % 2 == 0) {
			System.out.println("The number " + n + " is even");
		} else {
			System.out.println("The number " + n + " is odd");
		}
	}

	void palindrom(String word) {

		String b = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			b = b + word.charAt(i);
		}
		if (b.equals(word)) {
			System.out.println(word + " is palindrom");
		} else {
			System.out.println(word + " is not palindrom");

		}

		//System.out.println(b);
	}

}
