package homework_1;

import java.util.Scanner;

public class Total_average_percentage {

	public static void main(String[] args) {
		System.out.println("Enter the marks of five subjects :");

		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float d = sc.nextFloat();
		float e = sc.nextFloat();
		
		float total = a+b+c+d+e;
		double average =total/5; 
		double percentage= total/600*100;
		System.out.println("Total :"+ total);
		System.out.println("Average :"+ average);
		System.out.println("Percentage :"+ percentage);


	}

}
