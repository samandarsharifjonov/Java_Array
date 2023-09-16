import java.util.Scanner;

public class Array23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        int [] arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        double s = 0;
        double s1 = 0;
        double index = 0;

        for (int i = 0; i < arr.length ; i++) {
            s1 += arr[i];
            if ( k <= i && l >= i){
                s+=arr[i];
                index++;
            }
        }

        System.out.println((s1-s)/(n-index));
    }
}
