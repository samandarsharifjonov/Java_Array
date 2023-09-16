import java.util.Scanner;

public class Array21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int []arr = new int [n];

        for (int i = 0; i < n ; i++) {
            arr[i] = scanner.nextInt();
        }

        double sum = 0;
        double index = 0;
        double result = 0;
        for (int i = 0; i < n ; i++) {
            if (k <= i && l >= i){
                sum+=arr[i];
                index++;
                result = sum / index;
            }
        }
        System.out.println(result);
    }
}
