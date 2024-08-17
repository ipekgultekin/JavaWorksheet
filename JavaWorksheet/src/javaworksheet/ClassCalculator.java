package javaworksheet;

public class ClassCalculator {

	public static void main(String[] args) {
		// OOP
		//CalculatorExample cal1 = new CalculatorExample();
		//cal1.num1 = 10;
		//cal1.num2 = 20;
		//System.out.println(cal1.num1);

		
		//CalculatorExample cal2 = new CalculatorExample();
		//cal2.num1 = 20;
		//System.out.println(cal2.num1);
		
		
		
		//Constructor 
		CalculatorExample cal3;
		cal3= new CalculatorExample(1,3);
		System.out.println(cal3.num1 + "+" + cal3.num2);
		cal3.num1 = 5;
		System.out.println(cal3.num1 + "-" + cal3.num2);
		
		
		
		CalculatorExample cal4;
		cal4 = new CalculatorExample(10,5);
		System.out.println(cal4.sumFunction());
		System.out.println(cal4.substractFunction());
		
		
		
	}
}