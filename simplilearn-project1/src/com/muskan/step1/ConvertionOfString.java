package com.muskan.step1;

public class ConvertionOfString {

	public static void main(String[] args) {
	String str1 = "1998";
	String str2 = "2018";
	String str3 = "1994";
	
	int number1 = Integer.parseInt(str1);
	int number2 = Integer.parseInt(str2);
	int number3 = Integer.parseInt(str3);
	
	System.out.println("Convert using Integer.parseInt() :" + number1 );
	System.out.println("Convert using Integer.parseInt() :" + number2 );
	System.out.println("Convert using Integer.parseInt() :" + number3 );
	
	String sum;
	sum = str1+str2;
	
	
	System.out.println("Sum="+sum);
	
	}
	

}
