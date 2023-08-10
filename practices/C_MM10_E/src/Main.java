import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rawData;
        //process inputs.
        while (sc.hasNextDouble()) {
            rawData = sc.nextDouble();
            //pass the processed data to methods.
            System.out.println(celsiusToFahrenheit(rawData));
        }
    }

    private static double celsiusToFahrenheit(double rawData) {
        BigDecimal bigDecimal = BigDecimal.valueOf(rawData * 9 / 5 + 32);
        return (double) bigDecimal.setScale(1, RoundingMode.HALF_UP).doubleValue();
    }
}