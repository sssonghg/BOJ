import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] ascending = {1,2,3,4,5,6,7,8};
        int[] descending = {8,7,6,5,4,3,2,1};

        int[] arr = new int[8];

        for (int i=0; i<8; i++) {
            arr[i] = input.nextInt();
        }

        boolean ascendingValue = true;
        for (int i=0; i<8; i++) {
            if (arr[i] != ascending[i]) ascendingValue = false;
        }

        boolean descendingValue = true;
        for (int i=0; i<8; i++) {
            if (arr[i] != descending[i]) descendingValue = false;
        }

        if (ascendingValue) System.out.println("ascending");
        else if (descendingValue) System.out.println("descending");
        else System.out.println("mixed");
    }
}