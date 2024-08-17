package javaworksheet;

public class Functions {

	static int add(int x) {
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		return sum;
	}
	
	static int r(int x) {
		if(x==1) {
			return 1;
		}
		return x+r(x-1);
	}
	
	public static void main(String[] args) {
		//Recursive 
		//f(1)=1
		//f(2) = f(1)+2
		System.out.println(r(10));	
		
		//f(5);
		//power(3,3);
		
		//int result2 = power2(10,2);
		//System.out.println(result2);		
	}
	
	static void f(int x) {
		int result = (x+2)*6;
		System.out.println(result);
	}
	
	static void power(int num1, int num2) {
		int result = 1;
		for(int i=1; i<num2; i++) {
			result *= num1;
		}
		
		System.out.println("Result is "+result);
	}
	
	static int power2(int a, int b) {
		int result = 1;
		
		for(int i=1; i<a; i++) {
			result *= b;
		}
		
		return result;
	}
	
	
	

}
