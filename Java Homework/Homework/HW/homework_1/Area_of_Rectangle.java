package homework_1;

import java.util.Scanner;

public class Area_of_Rectangle {

	public static void main(String[] args) {
		
		System.out.println("Enter length and breadth of Rectangle:");

		Scanner sc = new Scanner(System.in);
		
		float length = sc.nextFloat();
		float breadth = sc.nextFloat();
		float Area = length*breadth;
		System.out.println("Area of Rectangle is :"+ Area);
	}

}
