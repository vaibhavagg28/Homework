package homework_3;

import java.util.Scanner;

public class TicketNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a six-digit ticket number: ");
        int ticketNumber = input.nextInt();
        int lastDigit = ticketNumber % 10;
        int ticketPrefix = ticketNumber / 10;
        boolean isValid = (ticketPrefix % 7 == lastDigit); 
    
        if(isValid == true)
        System.out.println("Ticket number is valid: " + isValid);
        else
        System.out.println("Ticket number is not valid: false ");
    }
}