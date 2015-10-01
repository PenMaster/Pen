package unit2;

import java.util.Scanner;

public class Fibtest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(Fib.fib(n));

	}

}
