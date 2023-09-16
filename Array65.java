import com.sun.source.doctree.EndElementTree;

import java.util.Scanner;

public class Array65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int t = arr[k];

        for (int i = 0; i < n; i++) {
            arr[i] += t;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
