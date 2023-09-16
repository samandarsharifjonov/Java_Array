import java.util.Scanner;

public class Array39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr = new int [n];

        int soni = 0;
        int son1 = 1;
        int son2 = 0;
        for (int i = 0; i < n; i++) {
           arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] >= arr[i+1]){
                soni = 1;
            }else {
                son1+=soni;
                soni = 0;
            }
            if(arr[i] <= arr[i+1]){
                son2 = 1;
            }else {
                son1+=son2;
                son2=0;
            }
        }

        System.out.println(son1);
    }
}
