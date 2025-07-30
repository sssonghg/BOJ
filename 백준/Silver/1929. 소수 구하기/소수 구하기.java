import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sNum = input.nextInt();
        int eNum = input.nextInt();

        for (int i=sNum; i<=eNum; i++) {
            if (i==1) continue;
            if (i==2) {
                System.out.println(i);
                continue;
            }

            boolean is_prime = true;
            for (int j=2; j*j<=i; j++) {
                if (i%j==0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) System.out.println(i);
        }
    }
}