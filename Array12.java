import java.util.Scanner;

public class Array12 {    // bu array 13
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int [n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = n - 1; i >= 0; i-=2) {
            System.out.print(a[i]+" ");
        }
    }
}
