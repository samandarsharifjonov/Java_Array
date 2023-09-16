import java.util.Scanner;

public class Array43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        int soni = 1;
        int k = 0;

        for (int i = 0; i < n; i++) {
            if ( arr[k] != arr[i]){
                k = i;
                soni++;
            }
        }

        System.out.println(soni);
    }
}
