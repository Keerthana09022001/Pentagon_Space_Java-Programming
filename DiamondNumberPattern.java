import java.util.Scanner;

public class DiamondNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the limit: ");
        n = sc.nextInt();
        sc.close();

        /* TOP OF THE TRIANGLE */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }

            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }

            System.out.println();
        }

        /* BOTTOM OF THE TRIANGLE */
        
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int k = i; k >= 1; k--) {
                System.out.print(k + " ");
            }

            for (int l = 2; l <= i; l++) {
                System.out.print(l + " ");
            }

            System.out.println();
        }
    }
}
