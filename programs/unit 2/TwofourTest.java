//package unit2;

import java.util.Scanner;

public class TwofourTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		getTwoFour(n);
	}
	public static void getTwoFour(int n){
		
		if(n < 4){
			System.out.println("NO");
		}
		else{
			if(n % 2 == 0){
				System.out.println("YES");
				for(int i = n; i > 4; i -= 2){
					System.out.println(i + " - " + (i -1) + " = " + 1);
				}
				System.out.println("4 * 3 = 12");
				System.out.println("2 * 1 = 2");
				System.out.println("12 * 2 = 24");
				for(int j = 0; j < (n/2)-2;j ++){
					System.out.println("24 * 1 = 24");
				}
			}
			else{
				
				System.out.println("YES");
				for(int k = n; k > 5; k -= 2){
					System.out.println(k + " - " + (k -1) + " = " + 1);
				}
				System.out.println("5 * 4 = 20");
				System.out.println("3 + 2 = 5");
				System.out.println("5 - 1 = 4");
				System.out.println("20 + 4 = 24");
				for(int i = 0; i < (n/2)-2;i ++){
					System.out.println("24 * 1 = 24");
				}
			}
		}
	}
}
