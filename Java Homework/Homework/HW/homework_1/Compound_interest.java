package homework_1;

import java.util.Scanner;

public class Compound_interest {

	public static void main(String[] args) {
		System.out.println("Enter the value of P,T and R:");

		Scanner sc = new Scanner(System.in);
		
		float P = sc.nextFloat();
		float R = sc.nextFloat();
		float T = sc.nextFloat();
		double CI = P*Math.pow((1+R/100),T)-P;
		
		System.out.println("Compound Interest is :"+ CI);

	}

}
