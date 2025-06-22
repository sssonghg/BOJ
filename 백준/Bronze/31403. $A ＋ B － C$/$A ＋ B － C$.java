import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        System.out.println(n1+n2-n3);

        String plus = String.valueOf(n1) + n2;
        int plusInt = Integer.valueOf(plus);

        System.out.println(plusInt - n3);


    }
}