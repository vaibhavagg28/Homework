package homework_1;

import java.util.Scanner;

public class Dia_circ_area_of_Circle {

	public static void main(String[] args) {
		System.out.println("Enter radius of Circle:");

		Scanner sc = new Scanner(System.in);
		
		float radius = sc.nextFloat();
		
		float Diameter = 2*radius;
		double Circumference = 2*3.14*radius;
		double Area= 3.14*(radius*radius);
		System.out.println("Diameter of Circle is :"+ Diameter);
		System.out.println("Circumference of Circle is :"+ Circumference);
		System.out.println("Area of Circle is :"+ Area);

	}

}
