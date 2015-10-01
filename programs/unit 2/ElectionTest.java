package unit2;

import java.util.Arrays;
import java.util.Scanner;

public class ElectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getCan());
		}
	public static int getCan(){
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] vote = new int[n];
		int[] cityVote = new int [n];
		
		for(int i = 0;i < m; i++){
			for(int j = 0; j < n; j++){
				vote[j] = scan.nextInt();
			}
			cityVote[getMaxIndex(vote)] += 1;
			Arrays.fill(vote, 0);
		}
		return getMaxIndex(cityVote) + 1;
	}
	public static int getMaxIndex(int[] array) {
		int maxIndex = 0;
		for (int i = 1; i < array.length; i++){
			int newnumber = array[i];
			if ((newnumber > array[maxIndex])){
		maxIndex = i;
			}
		}
	return maxIndex;
	}

}
