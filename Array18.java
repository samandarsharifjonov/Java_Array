import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];


        for (int i = 0; i < n ; i++) {
           arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n ; i++) {
            if (arr[n-1]>arr[i]){
                System.out.println(arr[i]);
                return;
            }
        }
        System.out.println(0);
    }
}
