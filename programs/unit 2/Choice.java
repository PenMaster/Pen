package unit2;

import java.util.Scanner;

public class Choice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	public static int[] getArr(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		return arr;
	}
	
	public static int getRand(int[] arr){
		
		int rand = (int)(Math.random() * (arr.length));
		return arr[rand];
	}

}
