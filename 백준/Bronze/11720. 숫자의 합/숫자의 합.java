import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.nextLine();
        String str = input.nextLine();

        int sum=0;
        for (int i=0; i<num; i++) {
            int bufNum = (int)str.charAt(i) - 48;
            sum+=bufNum;
        }

        System.out.println(sum);
    }
}
