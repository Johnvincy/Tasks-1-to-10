package Guvijavacodes;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		  
	        
	        // Prompt the user to enter a string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        // Check if the string is a palindrome
	        boolean isPalindrome = checkPalindrome(input);
	        
	        if (isPalindrome) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	        
	        scanner.close();
	    }

	private static boolean checkPalindrome(String input) {
		// TODO Auto-generated method stub
		return false;
	}

}	
	
/*
public static void main(String[] args) {
	public static  checkPalindrome(String str) 
{
        // Initialize pointers for the start and end of the string
        int start = 0;
        int end = str.length() - 1;
    }
        // Loop through the string and compare characters
        while (start < end) {
            // If characters at current positions don't match, it's not a palindrome
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            // Move the pointers towards the center
            start++;
            end--;
        }
    
}

}*/
	

