package unit2;

import java.util.Arrays;
import java.util.Scanner;

public class lexa {

	public static void main(String[] args) {
		int[] array = getInput();
		System.out.println(Arrays.toString(returnLex(array)));
	}

	public static int[] returnLex(int[] array) {
		int pivotIndex = findPivot(array);
		int nextBig = findNextBig(pivotIndex, array);
		swapPivot(array, nextBig, pivotIndex);
		sortRest(array, pivotIndex + 1, array.length - 1);
		return array;
	}

	public static int[] getInput() {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scan.nextInt();

		return arr;
	}

	public static int findPivot(int[] array) {

		for (int i = array.length - 1; i > 0; i--) {
			if (array[i] > array[i - 1]) {
				return i - 1;
			}
		}
		return -1;
	}

	public static int findNextBig(int pivot, int[] array) {
		for (int i = array.length - 1; i > pivot; i--) {
			if (array[i] > array[pivot]) {
				return i;
			}
		}
		return -1;
	}

	public static void swapPivot(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void sortRest(int[] array, int i, int j) {
		int p = i;
		int q = j;
		while (p < q) {
			int temp = array[p];
			array[p] = array[q];
			array[q] = temp;
			p = p + 1;
			q = q - 1;
		}
	}
}
