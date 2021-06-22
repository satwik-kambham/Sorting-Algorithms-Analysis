// A template class for all other sorting algorithms
public class Template {
    // Implementation of sorting algorithm
    public static void sort(Comparable[] array) {

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
        
    }
}
