import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        input.nextLine();
        int j=0;

        while (j<num) {
            int score=0;
            int bufscore=0;

            String str = input.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'O') {
                    bufscore++;
                    score = score + bufscore;
                } else if (str.charAt(i) == 'X') {
                    bufscore = 0;
                }
            }

            System.out.println(score);
            j++;
        }
    }
}