package javaworksheet;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//for take input from user -- practice
		int a,b;
		System.out.println("Enter A:");
		a = input.nextInt();
		System.out.println("Enter B:");
		b = input.nextInt();
		
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		
		//loops -- practice
		int i=1;
		while(i<=5) { //The loop body executes only if the condition is true from the start.
			System.out.print(i+",");
			i++;
		}
		
		do { //The loop body executes at least once because the condition is checked after the loop body has executed.
			System.out.print(i+","); 
			i++;
		} while(i<=5);
		
		//break -- it stops the loop
		//continue -- proceeds the next step

	}

}
