import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rawData;
        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            //pass the processed data to methods.
            int[] result = calcCoins(rawData);
            System.out.println("NT10=" + result[0]);
            System.out.println("NT5=" + result[1]);
            System.out.println("NT1=" + result[2]);
        }
    }

    private static int[] calcCoins(int rawData) {
        int tenDollar, fiveDollar;
        tenDollar = rawData / 10;
        rawData = rawData - tenDollar * 10;
        fiveDollar = rawData / 5;
        rawData = rawData - fiveDollar * 5;
        return new int[]{tenDollar, fiveDollar, rawData};
    }
}