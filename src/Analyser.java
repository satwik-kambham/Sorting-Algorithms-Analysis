import java.util.Scanner;

public class Analyser {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();
        Selection.sort(array);
    }
}
