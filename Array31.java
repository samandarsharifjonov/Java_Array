import java.util.Scanner;

public class Array31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int sana = 0;
        for (int i = n - 1; i >0; i--) {

            if ( arr[i] > arr[i-1]){
                System.out.println(i);
                sana++;

            }
        }
        System.out.println(sana);
    }
}
