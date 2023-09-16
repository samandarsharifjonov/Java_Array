import java.util.Scanner;

public class Array37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int [n];


        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int soni = 1;
        for (int i = 1; i < n -1; i++) {
            if (!( arr[i] <= arr[i+1])){
                soni++;
            }
        }

        System.out.println(soni);


    }
}
