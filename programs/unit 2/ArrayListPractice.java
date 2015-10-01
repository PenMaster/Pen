package unit2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

	public static void main(String[] args) {
		System.out.println(returnArray());
	}
	
	public static ArrayList<Integer> returnArray(){
		ArrayList<Integer> array = getArrayList();
		getNewNumbers(array);
		return array;
	}
	
	public static ArrayList<Integer> getArrayList(){
		ArrayList <Integer> a = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++){
			a.add(scan.nextInt());
		}
		return a;
	}
	
	public static ArrayList<Integer> getNewNumbers(ArrayList<Integer> a){
		int n = a.size();
		for(int i = 0; i < n; i++){
			a.add(a.get(i));
			a.set(i, a.get(i)*2);
		}
		return a;
	}

}
