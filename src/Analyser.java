import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analyser {
    public static void main(String[] args) throws FileNotFoundException {
        String[] modes = new String[] { "random", "sort", "revsort", "part1Sorted", "part2Sorted" };
        String[] tests = new String[] { "1000", "10000", "100000" };
        // String[] tests = new String[] { "10", "20", "50", "100", "1000", "10000",
        // "100000", "1mil" };

        Long[][] measurements = new Long[modes.length][tests.length];

        Scanner scanner;
        int n;
        Integer[] array;

        int x = 0, y = 0;
        long time;
        for (String mode : modes) {
            System.out.println("Checking sort for mode: " + mode);
            for (String test : tests) {
                // take input from file
                scanner = new Scanner(
                        new File("C:\\Users\\satwi\\Desktop\\Projects\\Sorting Algorithms Analysis\\Tests\\" + mode
                                + test + ".txt"));
                n = scanner.nextInt();
                array = new Integer[n];
                for (int i = 0; i < n; i++)
                    array[i] = scanner.nextInt();
                scanner.close();

                // sort and measure the time it takes
                time = System.currentTimeMillis();
                Selection.sort(array);
                time = System.currentTimeMillis() - time;

                assert Selection.isSorted(array);

                measurements[x][y] = time;
                System.out.println(time);
                y++;
            }
            y = 0;
            x++;
            System.out.println();
        }
    }
}
