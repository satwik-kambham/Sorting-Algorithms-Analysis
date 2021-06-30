import java.util.Scanner;
// TODO something wrong
public class Shell {
    // Implementation of sorting algorithm
    public static void sort(Comparable[] array) {
        if (array.length == 0)
            return;

        int h = 1;
        while (h < array.length / 3)
            h = 3 * h - 1;

        while (h >= 1) {
            for (int i = h; i < array.length; i++) {
                for (int j = i; j > h && less(array[j], array[j - h]); j -= h)
                    exchange(array, j, j - h);
            }
            h /= 3;
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
        Shell.sort(array);
        assert !isSorted(array);
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " ");
    }
}
