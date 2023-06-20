package switchcase_questions;

import java.util.Scanner;

public class Furniture {

	public static void main(String[] args) {
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Pine wood and the table price is 100 $");
			break;
		case 2:
			System.out.println("Oak wood and the table price is 225 $");
			break;
		case 3:
			System.out.println("Mahagony wood and the table price is 310 $");
			break;
		default:
			System.out.println("Invalid selection the table price is 0 $");
			break;
		}
	}

}
