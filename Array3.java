import java.util.Arrays;
import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int []a=new int[n];
        a[0]= scanner.nextInt();
        int d= scanner.nextInt();
        System.out.print(a[0]+" ");
        for (int i = 1; i <a.length ; i++) {
            a[i]=a[i-1]+d;
            System.out.print(a[i]+" ");
        }


    }
}
