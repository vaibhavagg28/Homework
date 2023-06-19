package homework_1;

import java.util.Scanner;

public class Area_of_EquilateralTriangle {

	public static void main(String[] args) {
		System.out.println("Enter the side of EquilateralTriangle:");

		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		double Area = (a*a)*Math.sqrt(3)/4;
		System.out.println("Area of EquilateralTriangle is :"+ Area);


	}

}
