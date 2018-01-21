package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandler {

	public static void main(String[] args) {
			   
			       //System.out.println(foo());
			       Scanner scnr = new Scanner(System.in);
				    String number = scnr.next();
				    System.out.println(number);
				    try {
				        if (number.length() > 5) {
				        	System.out.println("try no");
				            throw new IllegalArgumentException();
				        }
				        Integer.parseInt(number);

				    } catch (ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException e) {
				        e.printStackTrace();
				    }
			   }

			/*   private static int foo() {
			      int a = 1, b = 2;
			      try {
			    	  System.out.println("try block");
			          return a+b;
			      } finally {
			    	  // If we put below method then this block will not be executed.finally block is always executed whether exception is handled or not. 
			    	  //Java finally block follows try or catch block.
			    	 // System.exit(a);
			          a = 10;
			          b = 20;
			          System.out.println("finally block");
			          return a+b;
			          
			     }
			   }*/
			 

			 

	}


