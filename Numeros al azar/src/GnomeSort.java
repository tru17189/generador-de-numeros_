

import java.util.Arrays;

public class GnomeSort {

	public static void main(String[] args) {
		int A[] = new int[3000];
		populateArray(A);
		System.out.println("INITIAL SORT");
		printArray(A);
		// sort the array
		insertionSort(A);
		System.out.println("\nFINAL SORT");
		printArray(A);
	}


	private static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int valueToSort = arr[i];
			int j = i;
			while (j > 0 && arr[j - 1] > valueToSort) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = valueToSort;
		}
	}

	public static void printArray(int[] B) {
		System.out.println(Arrays.toString(B));
	}

	public static void populateArray(int[] B) {
		for (int i = 0; i < B.length; i++) {
			B[i] = (int) (Math.random() * 1000);
		}
	}
}