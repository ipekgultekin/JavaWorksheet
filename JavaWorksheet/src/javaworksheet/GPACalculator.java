package javaworksheet;

import java.util.Scanner;

public class GPACalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);			
		double gpa;
		int midtermGrade, quizGrade, finalGrade;
		
		System.out.println("Please enter your quiz grade:");
		quizGrade = input.nextInt();
		
		System.out.println("Please enter your midterm grade:");
		midtermGrade = input.nextInt();
		
		System.out.println("Please enter your final grade:");
		finalGrade = input.nextInt();
		
		gpa = (quizGrade * 0.2)+(midtermGrade * 0.35)+(finalGrade * 0.45);
		
		
		System.out.println("Your Grades:");
	    System.out.println("Quiz: " + quizGrade);
	    System.out.println("Midterm: " + midtermGrade);
	    System.out.println("Final: " + finalGrade);
	    System.out.println("GPA: " + gpa);
	    
	    
	    if (gpa < 50) {
            System.out.println("You failed the course. (F)");
        } else {
            char grade;
            if (gpa >= 85) {
                grade = 'A';
            } else if (gpa >= 70) {
                grade = 'B';
            } else if (gpa >= 60) {
                grade = 'C';
            } else if (gpa >= 50) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Your letter grade is: " + grade);
        }
	    
	    input.close();

	}

}
