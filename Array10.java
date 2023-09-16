import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int [n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0){
                System.out.print(a[i]+" ");
            }
        }

        for (int i = n -1; i >= 0 ; i--) {
            if (a[i] % 2 != 0){
                System.out.print(a[i]+" ");
            }
        }

    }

}
