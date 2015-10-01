package unit2;

import java.util.Scanner;

public class Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Sumtest sum = new Sumtest();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter n");
		int n = scan.nextInt();
		
		sum.findSum(n);
		
	}

}
