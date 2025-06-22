import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nam = new int[42];
        int[] inputnum = new int[10];

        for(int i=0; i<10; i++) {
            inputnum[i] = input.nextInt();
            int bufnam = inputnum[i] % 42;
            nam[bufnam] = nam[bufnam] + 1;
        }

        int count = 0;
        for(int i=0; i<42; i++) {
            if(nam[i]!=0) count++;
        }
        System.out.println(count);
    }
}
