package homework_3;

import java.util.Scanner;

public class Room2 {

	public static void main(String[] args) {
		
		System.out.println("Enter the length and width of Room : ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int width = sc.nextInt();
		int area = length*width;
		
		System.out.println("The floor space is " + area + " squarefeet");

		

	}

}
