import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Array48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        StringBuilder str = new StringBuilder();
        int result = 0;

        for (int i = 0; i < n - 1; i++) {
            int count = 1;
            for (int i1 = i + 1; i1 < n; i1++) {
                if (arr[i] == arr[i1]) count++;
            }
            if (result < count) result = count;
        }
        System.out.println(result);
    }
}

