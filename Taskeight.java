package Guvijavacodes;

public class Taskeight {
 public static int factorial(int n) {
	 if(n==0 || n==1) {
	return 1;
	 }
	 else
	 {
		 return n*factorial (n-1);
	 }
	 }

	public static void main(String[] args) {
		int number=5;
		int result=factorial(number);
		System.out.println(number + "! =" +result);

		String msg="Guvi Geek";                         // to find the total length
		int length=msg.length();
		System.out.println("the total length is "+ length);
		
		
		String message="Welcome to Guvi";               // to print messgage for 10 times
		int times=10;
		
		for(int 
				i=0;i<=times;i++) {
			System.out.println(message);
		}
		
	}
	}

/* 
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int digitCount = String.valueOf(number).length();
        
        System.out.println("Number of digits: " + digitCount);
        
        scanner.close();
    }

*/