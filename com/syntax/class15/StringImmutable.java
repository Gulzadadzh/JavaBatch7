package com.syntax.class15;

public class StringImmutable {

	public static void main(String[] args) {
		
		String str="Today is a good day";  //new object gets created
		str=str.replace("good", "amazing"); // new object gets created and that object is assigned to str
		System.out.println(str);
		
		
		str.concat(".I love Sunday");  // new object gets created but no one is referring to that object
		System.out.println(str);  //original str did not get changed
		
		str.toUpperCase();  //new object gets created but no one is referring to that object
		System.out.println(str);//original str did not get changed
		
		
		String str1=new String("Hello");
		str1=str1.toUpperCase();
		System.out.println(str1);
		
		String str2="Hello";
		String str3="Hello";
		String str4="Hello";
		
		str.toUpperCase();  //completely new string Object is getting created
		System.out.println("Value of str2 if we did not assign it=" + str2);
		str2 =str2.toLowerCase();
		
		System.out.println("Value of str2 after assigment =" + str2);
		System.out.println("Value of str3= "+str3);
		System.out.println("Value of str4= "+str4);
		
		String str5=new String("Hello");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
