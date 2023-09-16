import java.util.Scanner;

public class Array75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int [n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int k = 0;
        int h = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

            if ( arr[i] > max){
                max = arr[i];
                h = i;
            }

            if (arr[i] < min ){
                min = arr[i];
                k = i;
            }
        }

        int p = k + (h - k) / 2;
        for (int i = k; i <= p ; i++) {
            int temp = arr[i];
            arr[i] = arr[h + k -i];
            arr[h+k-i] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }




    }
}
