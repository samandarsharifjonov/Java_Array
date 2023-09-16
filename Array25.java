import java.util.Scanner;

public class Array25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int d = arr[1]/arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (d != arr[i+1]/arr[i]){
                System.out.println(0);
                return;
            }
        }
        System.out.println(d);
    }
}
