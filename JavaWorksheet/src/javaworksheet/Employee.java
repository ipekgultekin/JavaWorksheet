package javaworksheet;

public class Employee {
	private String name;
	public double salary;
	private int workHours;
	private int hireYear;
	
	Employee(String name, double salary, int workHours, int hireYear){
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	
	
	public double taxMethod() {
		if(this.salary >= 1000) {
			return salary*0.03;
		}
		
		return 0.0;
	}
	
	
	
	public double bonus() {
		int extraHours = this.workHours - 40;
		if(extraHours > 0)
			return 30*extraHours;
		return 0.0;
		
	}
	
	
	
	public double increase() {
		int year = 2020 - this.hireYear;
		if(year < 10) {
			return salary*0.5;
		}
		else if(year >= 10 && year < 20) {
			return salary*0.10;
		}
		else {
			return salary*0.5;
		}
	}
	
	public void toString(Employee emp) {
		System.out.println("Tax: "+ emp.taxMethod());
		System.out.println("Bonus: "+ emp.bonus());
		System.out.println("Increase: "+ emp.increase());
		
		double totalSalary = emp.salary - emp.taxMethod() + emp.bonus();
		System.out.println("Total salary with tax and bonus: "+ totalSalary);
		System.out.println("Total salary with raise of salary: "+ emp.salary+ emp.increase());
	}
	
	

}
