import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int max, min;

        int firstNum = input.nextInt();
        max = firstNum;
        min = firstNum;

        for (int i=1; i<num; i++) {
            int inputNum = input.nextInt();
            if (inputNum > max) max = inputNum;
            else if (inputNum < min) min = inputNum;
        }

        System.out.println(min + " " + max);
    }
}