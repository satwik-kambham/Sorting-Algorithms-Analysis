import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

// A class that generates an array of given length based on different modes
// To run this program, follow these steps
// 1. Compile the program
// 2. run by passing 2 arguments - mode and number of items.
// modes - random, sorted, revSorted, partSorted1, partSorted2
public class generator {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream fileStream = new PrintStream(new File(args[2]));
        String mode = args[0];
        int n = Integer.parseInt(args[1]);
        if (mode.equals("random")) {
            fileStream.println(n);
            Random random = new Random();
            for (int i = 1; i <= n; i++) {
                fileStream.print(random.nextInt(n) + " ");
                if (i % 10 == 0)
                    fileStream.println();
            }
        } else if (mode.equals("sorted")) {
            fileStream.println(n);
            Random random = new Random();
            for (int i = 1; i <= n; i++) {
                fileStream.print((5 * i + random.nextInt(5)) + " ");
                if (i % 10 == 0)
                    fileStream.println();
            }
        } else if (mode.equals("revSorted")) {
            fileStream.println(n);
            Random random = new Random();
            for (int i = 1; i <= n; i++) {
                fileStream.print(((n - i) * 5 + random.nextInt(5)) + " ");
                if (i % 10 == 0)
                    fileStream.println();
            }
        } else if (mode.equals("partSorted1")) {
            fileStream.println(n);
            Random random = new Random();
            for (int i = 1; i <= n; i++) {
                fileStream.print((i + random.nextInt(5)) + " ");
                if (i % 10 == 0)
                    fileStream.println();
            }
        } else if (mode.equals("partSorted2")) {
            fileStream.println(n);
            Random random = new Random();
            int i = 1;
            for (; i <= 3 * n / 4; i++) {
                fileStream.print((5 * i + random.nextInt(5)) + " ");
                if (i % 10 == 0)
                    fileStream.println();
            }
            for (; i <= n; i++) {
                fileStream.print((random.nextInt(n)) + " ");
                if (i % 10 == 0)
                    fileStream.println();
            }
        } else {
            fileStream.println("Mode not recognized");
        }
    }
}
