import java.util.Scanner;

public class Array82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i+k];
        }

        for (int i = 0; i < k; i++) {
            arr[n-k+i] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
