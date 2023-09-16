import java.util.Scanner;

public class Array38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

        int soni =1;
        for (int i = 0; i < n-1; i++) {
            if ( !(arr[i] >= arr[i+1])){
                soni++;
            }
        }

        System.out.println(soni);
    }
}
