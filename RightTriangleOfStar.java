import java.util.Scanner;
public class RightTriangleOfStar
{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++) {
	        for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }

            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}