import java.util.Scanner;

public class Array52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double []a = new double[n];
        double []b = new double[n];


        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] < 5){
                b[i] = 2 * a[i];
            }else {
                b[i] = a[i]/2;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
