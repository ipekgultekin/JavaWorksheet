package javaworksheet;

import java.util.Scanner;

public class RecursiveExample {
	//Palindrom number example
	
	static boolean isPalindrom(int number) {
		int tmp, newNumber=0, remainder;
		tmp = number;
		
		while(tmp!=0) {
			remainder = tmp % 10;
			newNumber = newNumber * 10 + remainder;
			tmp /= 10;
		}
		
		if(number==newNumber)
			return true;
		
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		System.out.println("Enter a number for checking Palindrom or not: ");
		a = input.nextInt();
		System.out.println(isPalindrom(a));
		

	}

}
