package calender;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numTest = scan.nextInt();
		
		for(int i = 0; i < numTest; i++){	
		
			//System.out.println("Enter day of month: ");
			int day  = scan.nextInt();
			
			//System.out.println("Enter month:");
			int month = scan.nextInt();
			
			//System.out.println("Enter the current year: ");
			int year = scan.nextInt();
			
			myCalender calender = new myCalender(month, day, year);
			
			calender.setDate();
			
			System.out.println(calender.getDay());
		}
		scan.close();
	}
	
}
