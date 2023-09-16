import java.util.Scanner;

public class Array29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; i+=2) {
            if ( max < arr[i]){
               max = arr[i];
            }
        }

        System.out.println(max);
    }
}
