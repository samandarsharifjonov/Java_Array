import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a =  new int [n];
        int a0 = 1;
        int a1 = 1;
            if(n>=1) System.out.print(a0+" ");
            if(n>=2) System.out.print(a1+" ");

        for (int i = 2; i < n; i++) {
            a[i] = a1+a0;
            a0 = a1;
            a1 = a[i];
            System.out.print(a[i]+" ");
        }
    }
}
