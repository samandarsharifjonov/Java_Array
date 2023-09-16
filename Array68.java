import java.util.Scanner;

public class Array68 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int index1 = 0; // Index 1
        int index2 = 0;//  Index 2

        for (int i = 0; i < n; i++) {

            if (arr[i] <= min) {
                min = arr[i];
                index2 = i;
            }

            if (arr[i] >= max) {
                max = arr[i];
                index1 = i;
            }
        }

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) System.out.println(arr[i]);
            else System.out.println(0);
        }


    }

}
