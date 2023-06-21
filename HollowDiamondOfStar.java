import java.util.Scanner;

public class HollowDiamondOfStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, space;
        System.out.print("Enter the limit: ");
        n = sc.nextInt();
        sc.close();

        /* OUTER TRIANGLE OF FIRST PYRAMID */

        for (int i = 0; i < n; i++) {
            for (space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == i || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        /* OUTER TRIANGLE OF REVERSE PYRAMID */

        for (int i = n - 2; i >= 0; i--) {
            for (space = 0; space < n - i - 1; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                if (j == i || j == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
