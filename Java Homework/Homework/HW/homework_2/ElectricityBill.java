package homework_2;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		
		System.out.println("Enter the units of your electricity meter: ");
		Scanner sc = new Scanner(System.in);
		
		double units = sc.nextDouble();
		double  totalEbill;
		
		if(units<=50) {
			totalEbill= units* 0.50 ;
		}
		else if(units<=150) {
			totalEbill= (50* 0.50)+ (units-50) *0.75;
		}
		else if(units<=250){
			totalEbill= (50* 0.50)+(100*0.75)+(units-150)*1.20;
		}
		else {
			totalEbill= (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + (units-250)*1.50;
		}
		totalEbill+= totalEbill*0.2;
		System.out.println("Your Electricity bill is of Rs."+totalEbill);
	}
	
}
