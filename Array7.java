import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];

        for (int i=0; i < n ; i++)
        {
            a[i] = scanner.nextInt();
        }

        for (int j = n-1; j >= 0; j--)
        {
            System.out.print(a[j] + " ");
        }

    }
}
