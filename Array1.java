import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int [n];
        for (int i = 0; i < n ; i++) {
            a[i] = i * 2 + 1;
            System.out.println(a[i]+" ");
        }
    }
}