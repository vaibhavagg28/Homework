package homework_2;

import java.util.Scanner;

public class triangleValidOrNot {

	public static void main(String[] args) {
		System.out.println("Enter angles of Triangle:");
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if(A+B+C == 180) {
			System.out.println("Triangle is Valid");
		}
		
		else {
			System.out.println("Triangle is Not Valid");
		}
			
	}
	 
}

