package switchcase_questions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        System.out.println("select the operator:");
        String choice= scanner.next();
        double result;
        switch(choice) {
       
        case"+":
        	result=first+second;
        	 System.out.println(result);
        	break;
        case"-":
        	result=first-second;
        	 System.out.println(result);
        	break;
        case"/":
        	result=first/second;
        	 System.out.println(result);
        	break;
        case"*":
        	result=first*second;
        	 System.out.println(result);
        	break;
        	     	
        }
       
        
    }
}