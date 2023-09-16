import java.util.Scanner;

public class Array36 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt();
        int []arr = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean k = false;
        int max = 0;
        for (int i = 1; i < n - 2; i++) {
            if (!(arr[i-1] > arr[i] && arr[i] < arr[i+1] || arr[i-1] < arr[i] && arr[i] > arr[i+1])){
                if ( max < arr[i]){
                    max = arr[i];
                    k = true;
                }
            }
        }

        if ( k && arr[n-1] > max){
            max = arr[ n - 1];
        }

        System.out.println(max);
    }
}
