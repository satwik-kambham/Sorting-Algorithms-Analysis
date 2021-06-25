import java.util.Scanner;

public class Merge {
    // Implementation of sorting algorithm
    public static void sort(Comparable[] array) {
        Comparable[] aux = new Comparable[array.length];
        sort(array, aux, 0, array.length - 1);
    }

    private static void sort(Comparable[] array, Comparable[] aux, int lo, int hi) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        sort(array, aux, lo, mid);
        sort(array, aux, mid + 1, hi);
        merge(array, aux, lo, mid, hi);
    }

    private static void merge(Comparable[] array, Comparable[] aux, int lo, int mid, int hi) {
        // copy to aux[]
        for (int k = lo; k <= hi; k++) {
            aux[k] = array[k];
        }

        // merge back to a[]
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid)
                array[k] = aux[j++];
            else if (j > hi)
                array[k] = aux[i++];
            else if (less(aux[j], aux[i]))
                array[k] = aux[j++];
            else
                array[k] = aux[i++];
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
        Merge.sort(array);
        assert !isSorted(array);
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
    }
}
