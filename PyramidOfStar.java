import java.util.Scanner;

public class PyramidOfStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the limit : ");
        n = sc.nextInt();
        sc.close();
        int rows = n, k = 0;
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
    }
}