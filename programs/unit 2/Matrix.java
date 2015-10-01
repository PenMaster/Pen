package unit2;

import java.util.Scanner;

public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
	}
	
	public static void multiplyMatrix (){
		int [][] matOne = getMat();
		int [][] matTwo = getMat();
		multiply(matOne, matTwo);
	}
	
	public static int[][] getMat(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter row: ");
		int row = scan.nextInt();
		System.out.println("Enter column: ");
		int col = scan.nextInt();
		int[][] mat = new int[row][col];
		for (int i = 0;i < row; i++){
			for(int j = 0;j < col; j++)
			mat[i][j] = scan.nextInt();
		}
		return mat;
	}

	public static void multiply(int[][] matOne, int[][] matTwo){
		try{
			for(int i = 1; i < matOne.length; i++){
				
			}
		}
		catch(Exception e){
			
		}
	}
}
