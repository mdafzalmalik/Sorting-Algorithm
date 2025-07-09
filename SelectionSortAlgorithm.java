package sorting_algorithm;

public class SelectionSortAlgorithm {

	public static void main(String[] args) {
		int[] arr = {8, 3, 9, 5, 0, 6};
		selectionSorting(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	public static void selectionSorting(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int index = minIndex(arr, i);
			int temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
	}
	
	public static int minIndex(int[] arr, int i) {
		int min = i;
		for (int j = i+1; j < arr.length; j++) {
			if (arr[min] > arr[j]) {
				min = j;
			}
		}
		return min;
	}

}
