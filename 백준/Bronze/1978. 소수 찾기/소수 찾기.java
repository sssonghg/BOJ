import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tcase = input.nextInt();
        int i = 0;
        int count = 0;

        while (i<tcase) {
            boolean is_prime = true;
            int num = input.nextInt();
            if (num==1) {
                i++;
                is_prime = false;
                continue;
            }
            if (num==2) {
                count++;
                i++;
                continue;
            }
            for (int j=2; j<num; j++) {
                if (num%j==0) is_prime=false;
            }
            if (is_prime) count++;
            i++;
        }
        System.out.println(count);
    }
}