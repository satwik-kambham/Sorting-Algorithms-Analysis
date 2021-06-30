import java.util.Scanner;

public class InsertionImp {
    // Implementation of sorting algorithm
    public static void sort(Comparable[] array) {
        if (array.length == 0)
            return;
        int n = array.length;

        // put smallest element in position to serve as sentinel
        int exchanges = 0;
        for (int i = n - 1; i > 0; i--) {
            if (less(array[i], array[i - 1])) {
                exchange(array, i, i - 1);
                exchanges++;
            }
        }
        if (exchanges == 0)
            return;

        // insertion sort with half-exchanges
        for (int i = 2; i < n; i++) {
            Comparable v = array[i];
            int j = i;
            while (less(v, array[j - 1])) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = v;
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
            if (less(array[i], array[i - 1]))
                return false;
        return true;
    }

    // Main method for testing the algorithm
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        n = scanner.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++)
            array[i] = scanner.nextInt();
        scanner.close();
        InsertionImp.sort(array);
        assert !isSorted(array);
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
    }
}
