package homework_2;

import java.util.Scanner;

public class SalaryOfEmployee {

	public static void main(String[] args) {
		System.out.println("Input basic salary of an Employee: ");
		
		Scanner sc = new Scanner(System.in);
		
		double basicSalary = sc.nextDouble();
		double hra, da, grossSalary;
		
		if(basicSalary<=10000) { 
			hra = basicSalary*0.2;
			da = basicSalary*0.8;
			
		}else if(basicSalary<=20000) {  
				hra = basicSalary*0.25;
				da = basicSalary*0.9;
		
		}else {
			hra=basicSalary*0.3;
			da = basicSalary*0.95;
		}
		
		grossSalary= hra+da;
		
		System.out.println("Gross salary of an Employee is: "+grossSalary);

	}

}
