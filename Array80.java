import java.util.Scanner;

public class Array80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
             arr[i] = arr[i+1];
            if(i == n-2) arr[i+1] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
