import java.util.Scanner;

public class Array35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int [n];


        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n - 2; i++) {
            if ( arr[i-1] < arr[i] && arr[i] > arr[i+1]){
                if(arr[i]<min)
                    min = arr[i];
            }
        }
        System.out.println(min);
    }
}




