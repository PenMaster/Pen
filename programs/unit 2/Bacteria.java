package unit2;

import java.util.Scanner;

public class Bacteria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(findBacteria(n));
	}
	
	public static int findBacteria(int n){
		int bactNum = 0;
		while(n > 0){
			if(n % 2 == 1){
				bactNum ++;
			}
			n = n / 2;
		}
		return bactNum;
	}
}
