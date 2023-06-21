import java.util.Scanner;

public class DiamondOfStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, k = 0;
        System.out.print("Enter the limit: ");
        rows = sc.nextInt();
        sc.close();

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }

        for (int i = rows - 1; i >= 1; --i) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            for (int j = i; j <= 2 * i - 1; ++j) {
                System.out.print("* ");
            }

            for (int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
