import java.util.Scanner;

public class Array76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int [n];


        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = 0;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i+1]){
                arr[i] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }



    }
}
