import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            if (a==0 && b==0 && c==0) break;

            if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a) {
                System.out.println("right");
            }
            else System.out.println("wrong");
        }
    }
}