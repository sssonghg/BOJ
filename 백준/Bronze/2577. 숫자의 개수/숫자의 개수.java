import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n1 = input.nextLong();
        long n2 = input.nextLong();
        long n3 = input.nextLong();
        
        String smul = String.valueOf(n1*n2*n3);

        for(int i=0; i<=9; i++) {
            int count = 0;
            for (int j=0; j<smul.length(); j++) {
                if((int)(smul.charAt(j)-48) == i) count++;
            }
            System.out.println(count);

        }
    }
}