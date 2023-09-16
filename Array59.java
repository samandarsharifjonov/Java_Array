import java.util.Scanner;

public class Array59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        double[] b = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int k = 1;
        double sum;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < k; j++) {
                sum += a[j];
            }
            sum /= k;
            k++;
            b[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(b[i]);
        }

    }
}
