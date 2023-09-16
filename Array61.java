import java.util.Scanner;

public class Array61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        double[] b = new double[n];

        double sum = 0, s = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }

        for (int i = 0; i < n; i++) {
            b[i] += (sum - s) / (n - i);
            s += a[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }

    }
}
