import java.util.Scanner;

public class Array69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        if (n == 0){
            System.out.println(0);
            return;
        }


        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        for (int i = 1; i < n; i+=2) {

            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;

        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
