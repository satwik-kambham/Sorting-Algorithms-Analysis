import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Analyser {
    public static void writeToCSV(Integer[][] data, Integer[] testLengths) throws IOException {
        FileWriter fileWriter = new FileWriter(new File("output.txt"));
        fileWriter.write(data[0].length + System.getProperty("line.separator"));
        for (int i = 0; i < testLengths.length; i++) {
            fileWriter.write(testLengths[i] + " ");
        }
        fileWriter.write(System.getProperty("line.separator"));
        for (int x = 0; x < 5; x++) {
            for (int i = 0; i < data[x].length; i++) {
                fileWriter.write(Integer.toString(data[x][i]) + " ");
            }
            fileWriter.write(System.getProperty("line.separator"));
        }
        fileWriter.flush();
    }

    public static void main(String[] args) throws IOException {
        int n = 20;
        Integer[] testLengths = new Integer[] { 10, 100, 1000, 2500, 5000, 7500, 10000 };
        Integer[][][] measurements = new Integer[5][testLengths.length][n];
        Integer[][] finalMeasurements = new Integer[5][testLengths.length];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < testLengths.length; j++) {
                finalMeasurements[i][j] = (Integer) 0;
            }
        }

        Integer[] array;
        Integer time;

        Scanner scanner = new Scanner(System.in);

        time = (int) System.currentTimeMillis();
        n = scanner.nextInt();
        time = (int) System.currentTimeMillis() - time;
        System.out.println(time);

        for (int i = 0; i < testLengths.length; i++) {
            for (int j = 0; j < n; j++) {
                array = generator.random(testLengths[i]);
                time = (int) System.currentTimeMillis();
                Selection.sort(array);
                measurements[0][i][j] = (int) System.currentTimeMillis() - time;

                array = generator.sorted(testLengths[i]);
                time = (int) System.currentTimeMillis();
                Selection.sort(array);
                measurements[1][i][j] = (int) System.currentTimeMillis() - time;

                array = generator.revSorted(testLengths[i]);
                time = (int) System.currentTimeMillis();
                Selection.sort(array);
                measurements[2][i][j] = (int) System.currentTimeMillis() - time;

                array = generator.partSorted1(testLengths[i]);
                time = (int) System.currentTimeMillis();
                Selection.sort(array);
                measurements[3][i][j] = (int) System.currentTimeMillis() - time;

                array = generator.partSorted2(testLengths[i]);
                time = (int) System.currentTimeMillis();
                Selection.sort(array);
                measurements[4][i][j] = (int) System.currentTimeMillis() - time;
            }
            for (int y = 0; y < 5; y++) {
                for (int x = 0; x < n; x++) {
                    finalMeasurements[y][i] += measurements[y][i][x];
                }
                finalMeasurements[y][i] /= n;
            }
            System.out.println("The average time to sort " + testLengths[i] + " random items is: "
                    + finalMeasurements[0][i] + " in milliseconds");
            System.out.println("The average time to sort " + testLengths[i] + " sorted items is: "
                    + finalMeasurements[1][i] + " in milliseconds");
            System.out.println("The average time to sort " + testLengths[i] + " reverse sorted items is: "
                    + finalMeasurements[2][i] + " in milliseconds");
            System.out.println("The average time to sort " + testLengths[i] + " partially sorted 1 items is: "
                    + finalMeasurements[3][i] + " in milliseconds");
            System.out.println("The average time to sort " + testLengths[i] + " partially sorted 2 items is: "
                    + finalMeasurements[4][i] + " in milliseconds");
            System.out.println();
        }
        writeToCSV(finalMeasurements, testLengths);
    }
}
