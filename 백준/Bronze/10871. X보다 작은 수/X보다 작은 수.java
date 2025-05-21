import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayNum = input.nextInt();
        int min = input.nextInt();

        int[] array = new int[arrayNum];
        for(int i=0; i<arrayNum; i++) {
            array[i] = input.nextInt();
        }

        for(int i=0; i<arrayNum; i++) {
            if (array[i] < min) {
                System.out.print(array[i] + " ");
            }
        }
    }
}