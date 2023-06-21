import java.util.Scanner;

public class PascalTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the limit : ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j+1);
            }
            System.out.println();
        }
        sc.close();
    }
}
