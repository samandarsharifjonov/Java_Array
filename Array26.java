import java.util.Scanner;

public class Array26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if ((arr[i] + arr[i-1] % 2 == 0)){
                System.out.println(i);
                return;
            }
        }

        System.out.print(0);
    }
}
