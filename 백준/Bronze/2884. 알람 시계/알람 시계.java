import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int min = input.nextInt();

        if (min < 45) {
            min = min + 60 - 45;

            if (hour == 0) {
                hour = 23;
            }
            else hour = hour-1;
        }
        else if (min >= 45) {
            min = min - 45;
        }
        System.out.println(hour + " " + min);
    }
}