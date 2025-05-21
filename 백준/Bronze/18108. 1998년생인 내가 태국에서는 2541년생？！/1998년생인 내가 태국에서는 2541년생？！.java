import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();

        if (b>=1000 && b<=3000) {
            System.out.println(b-543);
        }
    }
}