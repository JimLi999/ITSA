import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int rawData;


        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            System.out.printf("%.3f\n",calcSum(rawData));
        }
    }

    private static double calcSum(int rawData) {
        double sum = 0;
        for (int i = 1; i <= rawData; i++) {
            sum += Math.pow(-1, i + 1) * 1 / (2 * i - 1);
        }
        return sum;
    }
}