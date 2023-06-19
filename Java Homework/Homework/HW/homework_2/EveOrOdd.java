package homework_2;

import java.util.Scanner;

public class EveOrOdd {

	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		
		if (A % 2 == 0) {
			System.out.println("Entered Number is Even:");	
			}
		else {
			System.out.println("Entered Number is Odd:");	
		}
	}

}
