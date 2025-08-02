import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int num = input.nextInt();
            if (num==0) break;

            String stringnum = String.valueOf(num);
            int num_length = stringnum.length();
            if (num_length==1) {
                System.out.println("yes");
            }
            else if (num_length==2) {
                if (num/10 == num%10) System.out.println("yes");
                else System.out.println("no");
            }
            else if (num_length==3) {
                if (num/100 == num%10) System.out.println("yes");
                else System.out.println("no");
            }
            else if (num_length==4) {
                if ((num/1000 == num%10) && ((num%1000)/100 == (num%100)/10)) System.out.println("yes");
                else System.out.println("no");
            }
            else if (num_length==5) {
                if ((num/10000 == num%10) && (((num%10000)/1000)==((num%100)/10))) System.out.println("yes");
                else System.out.println("no");
            }
        }
    }
}