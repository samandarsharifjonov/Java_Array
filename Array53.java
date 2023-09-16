import java.util.Scanner;

public class Array53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int [n];
        int []b = new int[n];
        int []c = new int[n];


        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]){
                c[i] = a[i];
            }else {
                c[i] = b[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(c[i]+" ");
        }

   }
}
