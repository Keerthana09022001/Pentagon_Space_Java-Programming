import java.util.Scanner;

public class SandGlassStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the limit : ");
        n = sc.nextInt();
        sc.close();

        /* FOR LOOP FOR FIRST REVERSE PYRAMID */

        for (int i = n; i >= 1; i--) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        /* FOR LOOP FOR PYRAMID WHICH STARTS FROM 2 */

        for (int i = 2; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
