package unit2;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
	
		prime();
	}
	
	public static void prime(){
		boolean[] arr = getArray();
		findPrime(arr);
		getPrime(arr);
	}
	
	public static boolean[] getArray(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean[] array = new boolean[n+1];
		return array;
	}
	
	public static void findPrime(boolean[] array){
		for(int i = 2; i < array.length; i++){
			for(int j = 2; i*j < array.length; j++){
				array[i*j] = true;
			}
		}
	}
	
	public static void getPrime(boolean[] array){
		for(int i = 2; i < array.length; i++){
			if(!array[i]){
				System.out.println(i);
			}
		}
	}
}
