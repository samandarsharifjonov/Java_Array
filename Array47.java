import java.util.Scanner;

public class Array47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int soni = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if (arr[i] == arr[j]){
                    soni++;
                }
            }
        }

        System.out.println(Math.abs(soni - n));


    }
}
