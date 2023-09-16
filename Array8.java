import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int [n];
        int sum = 0;

        for (int i = 0; i < n ; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0){
                System.out.print(a[i]+" ");
                sum++;
            }
        }
        System.out.println("\n"+sum);


    }
}
