import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int rawData;

        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            System.out.println(calcSum(rawData));
        }
    }

    private static long calcSum(int rawData) {
        long sum = 0;
        for (int i = 1; i < rawData; i++) {
            if (isTarget(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isTarget(int num) {
        return num % 6 == 0 && !(num % 12 == 0);
    }
}