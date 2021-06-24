import java.util.Scanner;

// Selection Sort Implementation
public class Selection {
    // Implementation of sorting algorithm
    public static void sort(Comparable[] array) {
        if (array.length == 0) return;
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (less(array[j], array[x])) x = j;
            }
            exchange(array, i, x);
            x = i + 1;
        }
    }

    // Checks whether the first argument is less than the second
    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    // Exchanges two elements of the given array
    private static void exchange(Comparable[] array, int i, int j) {
        Comparable x = array[i];
        array[i] = array[j];
        array[j] = x;
    }

    // Checks whether the sort was successful
    public static boolean isSorted(Comparable[] array) {
        for (int i = 1; i < array.length; i++)
            if (less(array[i], array[i - 1])) return false;
        return true;
    }

    // Main method for testing the algorithm
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        n = scanner.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();
        Selection.sort(array);
        assert !isSorted(array);
        for (int i = 0; i < n; i++) System.out.print(array[i] + " ");
    }
}
