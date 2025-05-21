import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();

        for(int i=1; i<=9; i++) {
            System.out.println(n1 + " * " + i + " = " + (n1*i));
        }
    }
}