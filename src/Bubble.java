import java.util.Scanner;

public class Bubble {
	// method to sort the array
	public static void sort(Comparable[] array) {
		if (array.length < 2) {
			return;
		}

		int swaps = 1;
		while (swaps != 0) {
			swaps = 0;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i].compareTo(array[i + 1]) > 0) {
					swap(array, i, i + 1);
					swaps++;
				}
			}
		}
	}

	// method to swap two elements in an array
	private static void swap(Comparable[] array, int i, int j) {
		Comparable object = array[i];
		array[i] = array[j];
		array[j] = object;
	}

	public static void main(String[] args) {
		// Taking input that needs to be sorted
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer[] array = new Integer[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();

		// calling the sort method
		sort(array);

		// displaying the resultant array
		for (int i = 0; i < n; i++) {
			System.out.print(array[n] + " ");
		}
	}
}
