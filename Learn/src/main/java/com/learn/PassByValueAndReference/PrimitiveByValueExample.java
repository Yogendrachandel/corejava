package com.learn.PassByValueAndReference;
public class PrimitiveByValueExample {

	public static void main(String... primitiveByValue) {
    	    int homerAge = 30;
    	    changeHomerAge(homerAge);
    	    System.out.println(homerAge);
	}

	static void changeHomerAge(int homerAge) {
    	    homerAge = 35;
	}
}