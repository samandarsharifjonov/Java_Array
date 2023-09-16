import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int [n];
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        arr[0] = a;
        arr[1] = b;
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
       int  c = a + b;
        for (int i = 2; i < n; i++) {
            arr[i] = c;
            System.out.print(arr[i] + " ");
            c += c;
        }


    }
}
