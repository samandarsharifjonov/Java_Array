import java.util.Scanner;

public class Array17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int [n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = 0;
        int j = arr.length-2;
        int x = 1, y = 0;

        for (int i = 0; i < arr.length ; i++) {
            if ( i <= x){
                System.out.println(arr[k]);
                k++;
            }else {
                System.out.println(arr[j]);
                j--;
                y++;
            }

            if (y==2){
                y = 0;
                x = i + 2;
            }



        }

    }
}
