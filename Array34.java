import java.util.Scanner;

public class Array34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];
        int max;


        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        max = arr[0];
        for (int i = 1; i < n - 1; i++) {
            if (arr[i-1] > arr[i] && arr[i] < arr[i+1]){
                if (arr[i] > max){
                    max = arr[i];
                    break;

                }

            }

        }

        System.out.println(max);


    }
}
