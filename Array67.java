import java.util.Scanner;

public class Array67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }

        int k = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i]% 2 == 1){
                 k = arr[i];
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i]% 2 == 1){
                arr[i] += k;
            }

        }


        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
