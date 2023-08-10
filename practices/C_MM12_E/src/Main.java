import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //constant values.
        double targetMeterPerSec = 30/*feet*/ * 2.54/*centimeter*/ / 100;
        double yourMeterPerSec = 1;

        //variable
        int rawData;

        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            //pass the processed data to methods.
            System.out.println(calcTimeToExceed(rawData, yourMeterPerSec, targetMeterPerSec));
        }
    }

    private static int calcTimeToExceed(int rawData, double yourCentimeterPerSec, double targetCentimeterPerSec) {
        BigDecimal bigDecimal = BigDecimal.valueOf(rawData / (yourCentimeterPerSec - targetCentimeterPerSec));
        return bigDecimal.setScale(0, RoundingMode.CEILING).intValue();
    }
}