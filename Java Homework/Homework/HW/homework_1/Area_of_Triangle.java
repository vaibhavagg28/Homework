package homework_1;

import java.util.Scanner;

public class Area_of_Triangle {

	public static void main(String[] args) {
		System.out.println("Enter base and height of Triangle:");

		Scanner sc = new Scanner(System.in);
		
		float base = sc.nextFloat();
		float height = sc.nextFloat();
		float Area = (base*height)/2;
		System.out.println("Area of Triangle is :"+ Area);

	}

}
