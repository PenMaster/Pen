package unit2;

import java.util.Scanner;

public class StringPrac {

	public static void main(String[] args) {
		System.out.println(getParen());
	}

	public static String getParen() {
		String string = getString();
		findParen(string);
		return string;
	}

	public static String getString() {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		return str;
	}

	public static String findParen(String str) {
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();
		int counter = 0;
		for (int i = index; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				counter++;
			} 
			else if (str.charAt(i) == ')') {
				counter--;
			}
			else if(counter == 0){
				str.equals(str.substring(index, i+1));
			}
		}
		return str;
	}

}
