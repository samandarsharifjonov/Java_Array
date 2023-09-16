import java.util.Scanner;

public class Array20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }

        int s = 0;
        for (int i = 0; i < n ; i++) {
            if (k <= i && l >= i ){
                s+=arr[i];
            }
        }
        System.out.println(s);
    }
}
