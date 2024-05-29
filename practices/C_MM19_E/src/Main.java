import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int rawData = 0;


        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();

            System.out.printf("%.1f\n", calcFee(rawData));


        }
    }

    private static double calcFee(int rawData) {
        double fee = rawData * 0.9;

        if (rawData >= 1500)
            return fee *= 0.79;
        if (rawData > 800)
            return fee *= 0.9;

        return fee;
    }
}
