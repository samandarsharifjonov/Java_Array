import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = 0;
        int l = arr.length -1 ;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                System.out.print(arr[k]+" ");
                k++;
            }else {
                System.out.print(arr[l]+" ");
                l--;
            }
        }


    }
}
