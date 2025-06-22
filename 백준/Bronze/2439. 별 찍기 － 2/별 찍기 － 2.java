import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0; j<num-i-1; j++) {
                System.out.print(" ");
            }
            for (int k=num; k>num-i-1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}