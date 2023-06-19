package homework_2;

import java.util.Scanner;

public class Nodivby5or11 {

	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		  if (num % 5 == 0 && num % 11 == 0) {
	            System.out.println(num + " is divisible by both 5 and 11.");
	        } else {
	            System.out.println(num + " is not divisible by both 5 and 11.");
	        }

	}
}
