package javaworksheet;

public class CalculatorExample {
	public int num1;
	public int num2;
	
	CalculatorExample(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
		
	}
	
	public int sumFunction() {
		return (this.num1+this.num2);
	}
	
	public int substractFunction() {
		return (this.num1-this.num2);
	}
	
	
	public int multipFunction() {
		return (this.num1*this.num2);
	}
	
}
