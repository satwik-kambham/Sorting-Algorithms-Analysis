import java.util.Scanner;

public class Selection {
    // method to sort the array
    public static void sort(Comparable[] array) {
        if (array.length < 2) {
            return;
        }

        int min;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            // find min
            for (int j = i; j < array.length; j++) {
                if (array[j].compareTo(array[min]) > 0) {
                    min = j;
                }
            }

            swap(array, i, min);
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
            System.out.print(array[i] + " ");
        }
    }
}
