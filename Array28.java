import java.util.Scanner;

public class Array28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && min > i) {
                System.out.println(arr[i]);
                break;
            }
        }


    }
}
