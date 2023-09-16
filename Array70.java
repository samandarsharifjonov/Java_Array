import java.util.Scanner;

public class Array70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = n / 2;
        for (int i = 0; i < k; i++) {
            int c = arr[k + i];
            arr[k+i] = arr[i];
            arr[i] = c;
        }
        for (int i = 0; i < n; i++) System.out.println(arr[i]);
        if (n == 0) System.out.println(0);
    }
}
