package Recap;

public class MethodsWithReturn {
	public static void main(String[] args) {
		
	
	 MethodsWithReturn obj=new MethodsWithReturn();
	boolean isItEven= obj.even(6);
	System.out.println(isItEven);
}

	boolean even(int a) {

		boolean even;
		if (a % 2 == 0) {
			even = true;
		} else {
			even = false;
		}
		return even;
	}
	
	

}
