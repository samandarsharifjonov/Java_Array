import java.util.Scanner;

public class Array41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int [n];


        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0] + arr[1];
        int k = 1;
        for (int i = 1; i < n - 1 ; i++) {
            if (arr[i-1]+arr[i] >= max){
                max = arr[i-1] + arr[i];
                k = i;
            }
        }

        System.out.println(arr[k-1]);
        System.out.println(arr[k]);
    }
}
