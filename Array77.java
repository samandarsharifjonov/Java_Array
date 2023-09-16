import java.util.Scanner;

public class Array77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int loc = 0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i-1] > arr[i] && arr[i] < arr[i+1]){
                arr[i] = arr[i] * arr[i];
                i++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

}
