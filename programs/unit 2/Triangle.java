package unit2;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		System.out.println(getTri());
	}

	public static int getTri() {
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		int col = row;
		int[][] array = new int[row][col];
		for(int i = 0; i < row; i++){
			array[row][row] = array[row-1][col] + array[row-1][col-1];
			
		}
	}
}
