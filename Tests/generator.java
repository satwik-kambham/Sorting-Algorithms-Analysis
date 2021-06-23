import java.util.Random;

// A class that generates an array of given length based on different modes
// To run this program, follow these steps
// 1. Compile the program
// 2. run by passing 2 arguments - mode and number of items.
// modes - random, sorted, revSorted, partSorted1, partSorted2
public class generator {
    public static void main(String[] args) {
        String mode = args[0];
        int n = Integer.parseInt(args[1]);
        if (mode.equals("random")) {
            System.out.println(n);
            Random random = new Random();
            for (int i = 1; i <= n; i++) {
                System.out.print(random.nextInt(n) + " ");
                if (i % 10 == 0)
                    System.out.println();
            }
        } else if (mode.equals("sorted")) {
            System.out.println(n);
            Random random = new Random();
            for (int i = 1; i <= n; i++) {
                System.out.print((5 * i + random.nextInt(5)) + " ");
                if (i % 10 == 0)
                    System.out.println();
            }
        } else if (mode.equals("revSorted")) {
            System.out.println(n);
            Random random = new Random();
            for (int i = 1; i <= n; i++) {
                System.out.print(((n - i) * 5 + random.nextInt(5)) + " ");
                if (i % 10 == 0)
                    System.out.println();
            }
        } else if (mode.equals("partSorted1")) {
            System.out.println(n);
            Random random = new Random();
            for (int i = 1; i <= n; i++) {
                System.out.print((i + random.nextInt(5)) + " ");
                if (i % 10 == 0)
                    System.out.println();
            }
        } else if (mode.equals("partSorted2")) {
            System.out.println(n);
            Random random = new Random();
            int i = 1;
            for (; i <= 3 * n/4; i++) {
                System.out.print((5 * i + random.nextInt(5)) + " ");
                if (i % 10 == 0)
                    System.out.println();
            }
            for (; i <= n; i++) {
                System.out.print((random.nextInt(n)) + " ");
                if (i % 10 == 0)
                    System.out.println();
            }
        } else {
            System.out.println("Mode not recognized");
        }
    }
}
