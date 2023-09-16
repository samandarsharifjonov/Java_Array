import java.util.Scanner;

public class Array32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int [n];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 1; i < arr.length - 2 ; i++) {
            if (arr[i-1] > arr[i] && arr[i] < arr[i+1]){
                System.out.println(i);
                break;
            }
        }

    }
}
