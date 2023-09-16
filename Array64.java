import java.util.Scanner;


// Dastur xato

public class Array64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n*3];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

       if (a[0] < b[0] && b[0] < c[0]){
           for (int i = 0; i < n; i++) {
               d[i] = a[i];
               d[i+n] = b[i];
               d[i+2 * n] = c[i];
           }
       }

       if (a[0] < b[0] && b[0] < c[0]){
           for (int i = 0; i < n; i++) {
               d[i] = b[i];
               d[i+n] = a[i];
               d[i+2*n] = c[i];
           }
       }
       else {
           for (int i = 0; i < n; i++) {
               d[i] = a[i];
               d[i+n] = b[i];
           }
       }

        for (int i = 0; i < n * 3; i++) {
            System.out.println(d[i]);
        }
    }
}
