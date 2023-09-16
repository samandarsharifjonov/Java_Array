import java.util.Scanner;
import java.util.SortedMap;

public class Array62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int [n];
        int []b = new int [n];
        int []c = new int [n];
        int k = 0, m = 0, count = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if ( a[i] > 0){
                b[k++] = a[i];
                count++;
            }else {
                c[m++] = a[i];
            }
        }

        System.out.println(count);

        for (int i = 0; i < k; i++) {
            System.out.print(b[i]+" ");
        }

        for (int i = 0; i < m; i++) {
            System.out.print(c[i]+" ");
        }
    }
}
