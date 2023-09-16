import java.util.Scanner;

public class Array79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int [n];


        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i-1];
            if(i==1) arr[i-1] = 0;

        }
        // 1 2 3
        // 0 1 2

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
