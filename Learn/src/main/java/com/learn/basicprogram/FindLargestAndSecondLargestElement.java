package com.learn.basicprogram;

public class FindLargestAndSecondLargestElement {

	public static void main(String[] args) {
		
		int numArr[] = {0, 5, 14, 7, 26, 65, 123, 23,445};
		// Assign lowest possible int value
		  int firstNum = 0;
		  int secondNum = 0;
		  
		  for(int i = 0; i < numArr.length; i++){
		   if(firstNum < numArr[i]){
		    secondNum = firstNum;
		    firstNum = numArr[i];
		   }else if(secondNum < numArr[i]){
		    secondNum = numArr[i];
		   } 
		  }
		  System.out.println("Top two numbers : First -  "  + firstNum + " Second " + secondNum);
	}

}
