import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int[] a = new int[num];
        int[] b = new int[num];

        for(int i=0; i<num; i++) {
            a[i] = input.nextInt();
            b[i] = input.nextInt();
        }

        for(int i=0; i<num; i++) {
            System.out.println(a[i] + b[i]);
        }
    }
}