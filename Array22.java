import java.util.Scanner;

public class Array22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }
        int s = 0;
        int s1 = 0;
        for (int i = 0; i < n ; i++) {
            s1 += arr[i];
            if ( k <= i && l >= i){
               s+=arr[i];
            }
        }

        System.out.println(Math.abs(s1-s));


    }
}
