import java.util.Scanner;

public class Array56 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       int []arr = new int [n];
       int []brr = new int [n];
       int count = 0;

        for (int i = 0; i < n; i++) {
           arr[i] = scanner.nextInt();
        }

        for (int i = 2; i < n; i++) {
            if (i % 3 == 0){
                count++;
            }
        }

        System.out.println(count);

        for (int i = 2; i < n; i++) {
            if (i % 3 == 0){
                System.out.println(arr[i]);
            }
        }

    }
}
