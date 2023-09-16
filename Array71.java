import java.util.Scanner;

public class Array71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)arr[i] = scanner.nextInt();
        for (int i = 0; i < n / 2; i++) {
            int c = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = c;
        }
        for (int i = 0; i < n; i++) System.out.println(arr[i]);
        if (n == 0) System.out.println(0);
    }
}
