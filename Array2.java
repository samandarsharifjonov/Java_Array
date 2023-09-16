import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int [n];
        for (int i = 0; i < a.length; i++) {
            System.out.println((int)Math.pow(2, i));
        }
    }
}

