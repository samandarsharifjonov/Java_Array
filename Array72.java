import java.util.Scanner;

public class Array72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int k = scanner.nextInt();
        int h = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int p = k +(h - k + 1) / 2 - 1;  // p=k+(h-k+1)/2-1;
        for (int i = k; i <= p; i++) {
            int c = arr[i];
            arr[i] = arr[k+h-i];
            arr[k+h-i] = c;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
