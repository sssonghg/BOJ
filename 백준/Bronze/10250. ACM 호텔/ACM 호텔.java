import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        int count = 0;
        while(count<t) {
            int h = input.nextInt();
            int w = input.nextInt();
            int n = input.nextInt();
            int[][] arr = new int[w][h];

            for (int i=0; i<w; i++) {
                for(int j=0; j<h; j++) {
                    arr[i][j] = (j+1)*100 + (i+1);
                }
            }

            int check = 0;
            int buf = n;
            while (buf>h){
                buf = buf - h;
                check++;
            }
            
            System.out.println(arr[check][buf-1]);
            count++;
        }
    }
}