package switchcase_questions;

import java.util.Scanner;

public class Furniture2 {

	public static void main(String[] args) {
		System.out.println("\"Enter wood type (1 for pine, 2 for oak, 3 for mahogany):");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		int price ;
		
		switch(num) {
		case 1:
			price=100;
			System.out.println("Pine wood and the table price is "+price+" $");
			break;
		case 2:
			price=225;
			System.out.println("Oak wood and the table price is "+price+" $");
			break;
		case 3:
			price=310;
			System.out.println("Mahagony wood and the table price is"+price+" $");
			break;
		default:
			price=0;
			System.out.println("Invalid selection the table price is"+price+" $");
			break;
		}
		if (price != 0) {
			System.out.println("Enter table size (1 for large, 2 for small):");
			int num2 =sc.nextInt();
			if(num2 == 1) {	
				price=price+35;
				System.out.println("Large table price is "+price+" $");
			}
			else if(num2 == 2) {
				System.out.println("Assuming price of small table is "+price+" $");
			}
			else {
				System.out.println("Invalid selection");
			}
			
		}
		
		}
	}


