package Guvijavacodes;

import java.util.Scanner;

public class Gradingannauni {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        char grade;
	        
	        do {
		System.out.print("Enter marks: ");
        int marks = scanner.nextInt();
        
        // Check if the user wants to exit
        if (marks == 0) {
            break;
        }
        
        // Calculate grade based on marks
        grade = calculateGrade(marks);
        
        // Output the grade
        System.out.println("Grade: " + grade);
    } while (true);
    
    System.out.println("Exiting the program.");
    scanner.close();
}

	private static char calculateGrade(int marks) {
		return 0;
	}
		 public static char calculateGrade1(int marks) {
		        char grade;
		        
		        if (marks >= 90 && marks <= 100) {
		            grade = 'A';
		        } else if (marks >= 80 && marks <= 89) {
		            grade = 'B';
		        } else if (marks >= 70 && marks <= 79) {
		            grade = 'C';
		        } else if (marks >= 60 && marks <= 69) {
		            grade = 'D';
		        } else if (marks >= 50 && marks <= 59) {
		            grade = 'E';
		        } else {
		            grade = 'F';
		        }
				return grade;
				
	}

		    
		 }
	



	
