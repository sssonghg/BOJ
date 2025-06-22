import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int[] array = new int[26];

        for (int i = 97; i<=122; i++){
            boolean isChar = false;

            for (int j=0; j<word.length(); j++){
                if (array[122-(int)word.charAt(j)] == 1) continue;
                if (i == (int)word.charAt(j)) {
                    isChar = true;
                    System.out.print(j + " ");
                    array[122-(int)word.charAt(j)] = 1;
                }
            }
            if(!isChar) System.out.print(-1 + " ");
        }
    }
}
