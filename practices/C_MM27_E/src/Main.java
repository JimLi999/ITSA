import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int[] rawData = new int[2];

        int i = 0;
        //process inputs.
        while (sc.hasNextInt()) {
            if (i < 1) {
                rawData[i] = sc.nextInt();
                i++;
            } else {
                rawData[i] = sc.nextInt();
                //pass the processed data to methods.
                System.out.println(calcSum(rawData));
                i = 0;
            }
        }
    }

    private static long calcSum(int[] rawData) {
        long sum = 0;
        if (rawData[0] > rawData[1]) {
            rawData[0] = rawData[0] ^ rawData[1];
            rawData[1] = rawData[0] ^ rawData[1];
            rawData[0] = rawData[0] ^ rawData[1];
        }

        for (int i = rawData[0]; i <= rawData[1]; i++) {
            sum += i;
        }

        return sum;
    }
}