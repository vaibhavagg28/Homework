package homework_3;

import java.util.Scanner;

public class Carpet2 {

	public static void main(String[] args) {
		

	    System.out.println("Enter the length, width and price/sqft :");
	    
	    Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
        int width = sc.nextInt();
        double pricePerSquareFoot = sc.nextDouble();
        int area = length * width;
        
        double cost = area * pricePerSquareFoot;
        

        System.out.println("The cost of carpeting the room is $" + cost+"cents");
     	}

}
