package homework_3;

import java.util.Scanner;

public class Time2 {

	public static void main(String[] args) {
	
		 System.out.println("Enter the Minutes :");
		 Scanner sc = new Scanner(System.in);
		 
		 int Minutes = sc.nextInt();
		 int Hours = Minutes/60;
		 int remainingMinutes = Minutes % 60;
	  
		 System.out.println(Minutes + " minutes is equal to " + Hours + " hours and " + remainingMinutes + " minutes.");
		 
	}

}
