import java.util.Scanner;

public class Array78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if(i<n-1) {
                arr[i] = (arr[i] + arr[i + 1]) / 2;
            }
            System.out.println(arr[i]);
        }


    }
}
