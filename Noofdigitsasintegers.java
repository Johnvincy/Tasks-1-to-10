package Guvijavacodes;

import java.util.Scanner;

public class Noofdigitsasintegers {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter an integer: ");
		        int number = scanner.nextInt();
		        
		        // Calculate the number of digits
		        int digitCount = countDigits(number);
		        
		        // Output the result
		        System.out.println("Number of digits: " + digitCount);
		        
		        scanner.close();
		    }
		    
		    
		    public static int countDigits(int number) {
		        number = Math.abs(number);
		        int count = 0;
		        while (number != 0) {
		            count++;
		            number /= 10;
		        }
		        
		        return count;
		    }
		


	}


