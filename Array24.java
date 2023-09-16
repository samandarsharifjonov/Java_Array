import java.util.Scanner;

public class Array24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int d = arr[0] - arr[1];
        boolean progressiya = true;
        int q = arr[1]/arr[0];
        for (int i = 0; i < n-1; i++) {
            if (q!=arr[i+1]/arr[i]){
                System.out.println(0);
                return;
            }
        }
        //System.out.println(q);
        if (progressiya){
            System.out.println(d);
        }else {
            System.out.println(0);
        }
    }
}
