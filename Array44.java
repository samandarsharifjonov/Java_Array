import java.util.Scanner;

public class Array44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1 ; i++) {
            for (int j = i + 1 ; j < n; j++) {
                if (arr[i] == arr[j]){
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}
