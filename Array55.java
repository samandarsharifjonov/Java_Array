import java.util.Scanner;

public class Array55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if ((i & 1) == 1) count++;
        }
        System.out.println(count);
        for (int i = 0; i < n; i++) {
            if ((i & 1) == 1){
                System.out.println(a[i]);
            }
        }
    }
}
