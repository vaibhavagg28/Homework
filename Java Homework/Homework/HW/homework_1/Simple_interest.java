package homework_1;

import java.util.Scanner;

public class Simple_interest {

	public static void main(String[] args) {
		System.out.println("Enter the value of P,T and R:");

		Scanner sc = new Scanner(System.in);
		
		float P = sc.nextFloat();
		float T = sc.nextFloat();
		float R = sc.nextFloat();
		
		double SI= P*R*T/100;
		System.out.println("Simple interest is :"+ SI);
	

	}
}


