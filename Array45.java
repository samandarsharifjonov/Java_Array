import java.util.Scanner;

public class Array45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = Math.abs(arr[0] - arr[1]);

        int k = 0;
        for (int i = 1; i < n-1; i++) {
            if (min > Math.abs(arr[i] - arr[i+1])){
                k = i;
                min = Math.abs(arr[i] - arr[i+1]);
            }
        }

        System.out.println(k);
        System.out.println(k+1);

    }
}
