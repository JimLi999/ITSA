import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rawData;
        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            //pass the processed data to methods.
            int[] result = calcSquareAndCubic(rawData);
            System.out.println(result[0] + " " + result[1] + " " + result[2]);
        }
    }

    private static int[] calcSquareAndCubic(int rawData) {
        return new int[]{rawData, (int) Math.pow(rawData, 2), (int) Math.pow(rawData, 3)};
    }
}