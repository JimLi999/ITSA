import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rawData;
        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            //pass the processed data to methods.
            System.out.println(mileToKilometer(rawData));
            }
        }

    private static double mileToKilometer(int rawData) {
        BigDecimal bigDecimal=BigDecimal.valueOf(rawData*1.6);
        return bigDecimal.setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}