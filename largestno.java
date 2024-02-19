package Guvijavacodes;

import java.util.Scanner;

public class largestno {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.println("Enter three numbers: ");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        int num3 = scanner.nextInt();
	        
	        // Calculate the largest number
	        int largest = findLargest(num1, num2, num3);
	        
	        // Output the largest number
	        System.out.println("The largest number is: " + largest);
	        
	        scanner.close();
	    }
	    
	    // Method to find the largest number among three numbers
	   public static int findLargest(int a, int b, int c) {
	        int largest = a;
	        
	        if (b > largest) {
	            largest = b;
	        }
	        if (c > largest) {
	            largest = c;
	        }
	        
	        return largest;

	}

}
