import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int [n];
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n ; i++) {
            if (arr[n-1] > arr[i] &&  max < arr[i]){
                max = arr[i];
                index = i;
            }
        }

        System.out.println(index);

    }
}

