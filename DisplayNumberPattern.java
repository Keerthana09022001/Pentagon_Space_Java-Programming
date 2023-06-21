import java.util.Scanner;
public class DisplayNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 1;
        System.out.print("Enter the limit : ");
        n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
