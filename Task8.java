package Guvijavacodes;

import java.util.Scanner;

public class Task8 {

public static void main(String[] args) {
	int a=1;
	int b=2;
	int c=3;
	int y=4;
	if( a+b > c+y) {
		System.out.println("sum of a and b is greater than c and d");
	}
	else {
			System.out.println("sum of a and b is less than c and d");
	}
	
	//q2
	int num=11;
	if(num % 2 ==0) {
	System.out.println("print the even no");
	}
	else {
		System.out.println("the no is not even");
	}
	//Q3
	char startchar ='A';
	char endchar ='Z';
	 for (char i=startchar; i<= endchar; i++) {
		 System.out.println(i);
	 }
	 
	//q9 
	 
	 Scanner scanner=new Scanner(System.in);
	  
     System.out.print("Enter your age: ");
     int age = scanner.nextInt();
     
     // Check if the age qualifies for senior citizen
     if (age >= 65) {
         System.out.println("You are a senior citizen.");
     } else {
         System.out.println("You are not a senior citizen.");
     }
     
     scanner.close();
	
			}
		
	 }

	
	
	
	
	
	
	
	
	
	
	
	
	



