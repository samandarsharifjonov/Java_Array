import java.util.Scanner;

public class Array57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n ; i++) {
            if ((i & 1) == 0){
                System.out.println(a[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if ( (i & 1) == 1){
                System.out.println(a[i]);
            }
        }
    }
}
