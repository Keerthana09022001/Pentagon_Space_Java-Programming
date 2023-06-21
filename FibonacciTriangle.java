import java.util.Scanner;

public class FibonacciTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the limit : ");
        n = sc.nextInt();
        int a = 0, b = 1, c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a + " ");
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
        sc.close();
    }
}
