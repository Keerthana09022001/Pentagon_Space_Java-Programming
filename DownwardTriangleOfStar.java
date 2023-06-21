import java.util.Scanner;

public class DownwardTriangleOfStar {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        n = sc.nextInt();
        sc.close();
        for (int i = n; i > 0; i--) {
            for (int j = n; j > 0; j--) {
                if (j <= i)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
