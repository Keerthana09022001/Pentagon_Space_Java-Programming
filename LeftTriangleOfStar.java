import java.util.Scanner;

public class LeftTriangleOfStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the Limit : ");
        n = sc.nextInt();
        sc.close();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}