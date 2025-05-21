import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();
        int n6 = ((n1*n1) + (n2*n2) + (n3*n3) + (n4*n4) + (n5*n5)) % 10;

        System.out.println(n6);
    }
}