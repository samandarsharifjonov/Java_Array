import java.util.Scanner;

public class Array63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n + n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        if (a[0] < b[0]) {
            for (int i = 0; i < n; i++) {
                c[i] = b[i];
                c[i + n] = a[i];
            }
        } else {

            for (int i = 0; i < n; i++) {

                c[i] = a[i];
                c[i + n] = b[i];
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(c[i]);
        }
    }
}
