package com.caseSubmission;

public class FizzBuzz {
	
	public static void main(String[] args) {
		printValue();
	}

	private static void printValue() {
			// TODO Auto-generated method stub
		for(int i = 1;i<=100;i++){
			System.out.println((i%3==0 || i%5==0 ? ((i%3==0)? "Fizz": "") + ((i%5)== 0? "Buzz": "") : i ));			
		}
	}
}	
