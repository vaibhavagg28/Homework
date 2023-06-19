package homework_2;

import java.util.Scanner;

public class Elseif {

	public static void main(String[] args) {
		System.out.println("Enter your marks :");
		
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		if(marks < 35)
		{
			System.out.println("fail");
		}
		else if(marks >=35 && marks<=50) {
			System.out.println("3rd grade");
		}
			
		else if(marks>50 && marks<=65) {
				System.out.println("2nd grade");
		}
		
		else if(marks>65 && marks<=75) {
			System.out.println("1st grade");
	}
		
		else if(marks>75 && marks<=99) {
			System.out.println("Distinction");
	}
		else {
			System.out.println("Invalid Input");
		}
		
	}

}
