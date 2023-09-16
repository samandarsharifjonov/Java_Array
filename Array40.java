import java.util.Map;
import java.util.Scanner;

public class Array40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int []arr = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = Math.abs(arr[0]-r);
        int k = 1;

        for (int i = 1; i < n - 2 ; i++) {
            if ( min > Math.abs(arr[i]-r)){
                min = Math.abs(arr[i]-r);
                    k = i;

            }
        }
        System.out.println(arr[k]);
    }
}
