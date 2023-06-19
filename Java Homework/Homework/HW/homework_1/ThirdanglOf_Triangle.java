package homework_1;

import java.util.Scanner;

public class ThirdanglOf_Triangle {

	public static void main(String[] args) {
		System.out.println("Enter Two angles of Triangle:");

		Scanner sc = new Scanner(System.in);
		
		float X = sc.nextFloat();
		float Y = sc.nextFloat();
		double Z = 180-(X+Y);
		System.out.println("Third angle of Triangle is :"+ Z);
	}

}
