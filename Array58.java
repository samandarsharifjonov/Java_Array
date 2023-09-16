import java.util.Scanner;

public class Array58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int [n];
        int []b = new int [n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int k = 0;
        for (int i = 0; i < n; i++) {
            b[k] += a[i];
            System.out.println(b[k]);
        }

    }
}
