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
            System.out.println(calcSquareArea(rawData));
            }
        }

    private static double calcSquareArea(double rawData) {
        BigDecimal bigDecimal = BigDecimal.valueOf(Math.pow(rawData, 2));
        return bigDecimal.setScale(1, RoundingMode.HALF_UP).doubleValue();
    }

}