import java.util.Scanner;

public class Array30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int [n];  int s = 0;
        for (int i = 0; i < n ; i++) arr[i] = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            if ( arr[i-1] > arr[i]){
                s++;
                System.out.println(i-1);
            }
        }
        System.out.println(s);
    }
}
