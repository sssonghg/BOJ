import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        int count=0;
        int strlen = str.length() - 1;
        if (str.charAt(0) == ' ' && str.charAt(strlen) == ' ') {
            for (int i=0; i<str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count - 2;
        }

        else if (str.charAt(0) == ' ' || str.charAt(strlen) == ' ') {
            for (int i=0; i<str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count - 1;
        }

        else {
            for (int i=0; i<str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        System.out.println(count+1);
    }
}