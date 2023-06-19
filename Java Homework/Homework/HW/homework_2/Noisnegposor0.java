package homework_2;

import java.util.Scanner;

public class Noisnegposor0 {

	public static void main(String[] args) {
		
		System.out.println("Enter a Number:");
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		if(A<0) {
			System.out.println("Entered Number is Negative");
		}
		
		else if(A>0) {
			System.out.println("Entered Number is Positive");
		}
		
		else {
			System.out.println("Entered Number is Zero");
		}
		
	}
	
}
