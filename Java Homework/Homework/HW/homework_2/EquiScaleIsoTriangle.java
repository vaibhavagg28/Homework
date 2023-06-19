package homework_2;

import java.util.Scanner;

public class EquiScaleIsoTriangle {
	public static void main(String[] args) {
		System.out.println("Enter a Number:");
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if (A==B && B==C &&C==A)
			System.out.println("Given Sides are of Equilateral Triangle");
		else if (A == B || B== C||C==A )
			System.out.println("Given Sides are of Isosceles Triangle");
		 else {
			System.out.println("Given Sides are of Scalene Triangle");
		}
	}
	
}
