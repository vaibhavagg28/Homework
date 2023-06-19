package homework_2;

import java.util.Scanner;

public class LeapYearOrNot {


	   public static void main(String[] args){
	      int year;
	      System.out.println("Enter an Year : ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();
	      if (year % 4 == 0) 
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	   }
	

	}

