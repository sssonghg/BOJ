import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int max_num = input.nextInt();
        int[] arr = new int[num];

        for(int i=0; i<num; i++) {
            arr[i] = input.nextInt();
        }

        int max = 0;
        int nbuf;
        for(int i=0; i<num; i++) {
            for(int j=0; j<num; j++) {
                if(i>=j) continue;
                for(int k=0; k<num; k++) {
                    if(j>=k) continue;
                    nbuf = arr[i]+arr[j]+arr[k];
                    if(nbuf<=max_num) {
                        if(nbuf>max) max = nbuf;
                    }
                }
            }
        }
        System.out.println(max);
    }
}