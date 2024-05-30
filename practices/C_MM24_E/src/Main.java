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
                System.out.printf("%.1f\n", calcSalary(rawData));
                i=0;
            }
        }
    }

    private static double calcSalary(int[] rawData) {
        if (rawData[0] <= 60) {
            return rawData[0] * rawData[1];
        }
        if (rawData[0] < 120) {
            return ((rawData[0] - 60) * 1.33 + 60) * rawData[1];
        }
        return ((rawData[0] - 120) * 1.66 + 60 * 1.33 + 60) * rawData[1];
    }
}