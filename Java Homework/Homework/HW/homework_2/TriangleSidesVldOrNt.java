package homework_2;

import java.util.Scanner;

public class TriangleSidesVldOrNt {

		public static void main(String[] args) {
			System.out.println("Enter angles of Triangle:");
			
			Scanner sc = new Scanner(System.in);
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			
			if (A + B > C && B + C > A && A + C > B)
	            System.out.println("The triangle is valid.");
	        else
	            System.out.println("The triangle is not valid.");
			
			
				
		}

}


