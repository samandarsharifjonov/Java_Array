import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int []a = new int[n];

        for (int i = 0; i < n ; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = k; i < n; i+=k) {
            System.out.print(a[i] + " ");
        }


    }
}
