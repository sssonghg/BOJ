import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        double[] arr = new double[num];

        for(int i=0; i<num; i++) {
            arr[i] = input.nextDouble();
        }

        double max = 0;
        for(int i=0; i<num; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        double sum = 0;
        for(int i=0; i<num; i++) {
            arr[i] = arr[i]/max*100;
            sum += arr[i];
        }

        System.out.println(sum/num);
    }
}