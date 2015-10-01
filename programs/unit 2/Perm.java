package unit2;

import java.util.Scanner;

public class Perm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = getInput();
		System.out.println(perm(array));

	}
	
	public static int[] getInput() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();

		return arr;
	}
	
	public static boolean perm(int[] arr){
		boolean oneFound = false;
		boolean repeat = false;
		boolean length = true;
		for(int i = 0; i < arr.length-1; i++){
			if(arr[i] == 1){
				oneFound = true;
			}
			if(arr[i] == arr[i+1])
			{
				repeat = true;
			}
			if(arr[i] > arr.length){
				length = false;
			}
		}
		if(oneFound && !repeat && length){
			return true;
		}
		else{
			return false;
		}
		
	}

}
