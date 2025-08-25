import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();

        int nfac = 1;
        for (int i = 1; i<=N; i++) {
            nfac = nfac * i;
        }

        int nmink = 1;
        for (int i=1; i<=(N-K); i++) {
            nmink = nmink * i;
        }

        int kfac = 1;
        for (int i=1; i<=K; i++) {
            kfac = kfac * i;
        }

        System.out.println(nfac / (nmink * kfac));
    }
}