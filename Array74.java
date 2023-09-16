import java.util.Scanner;

public class Array74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int index = 0;
        int index1 = 0;

        if (n == 0){
            System.out.println(0);
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }

            if (arr[i] < min){
                min = arr[i];
                index1 = i;
            }
        }

        for (int i = index1+1; i < index; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }




    }
}
