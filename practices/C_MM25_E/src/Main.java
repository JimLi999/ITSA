import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int rawData;

        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();

            //pass the processed data to methods.
            System.out.println(calcSum(rawData));

        }
    }

    private static long calcSum(int rawData) {
        long sum = 0;
        for (int i = 1; i <= rawData; i++) {
            if (i % 3 == 0)
                sum += i;
        }
        return sum;
    }
}