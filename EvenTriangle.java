import java.util.Scanner;

public class EvenTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the line limit : ");
        int n = sc.nextInt();
        int even = 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(even + " ");
                even += 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
