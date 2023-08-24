import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //variable
        int[] rawData = new int[4];

        //process inputs.
        int i = 0;
        while (sc.hasNextInt()) {
            rawData[i] = sc.nextInt();
            if (i < 3) {
                i++;
            } else {
                //pass the processed data to methods.
                System.out.println(calcParkingFee(rawData));
                //reset index.
                i = 0;
            }
        }
    }

    private static int calcParkingFee(int[] rawData) {
        int parkSinceMin = rawData[0] * 60 + rawData[1];
        int parkEndsMin = rawData[2] * 60 + rawData[3];
        int totalParkingMin = parkEndsMin - parkSinceMin;

        if (totalParkingMin > 240) {
            totalParkingMin -= 240;
            return (int) (30 * 4 + 40 * 4 + 60 * Math.floor((float) totalParkingMin / 30));
        }
        if (totalParkingMin > 120 && totalParkingMin < 240) {
            totalParkingMin -= 120;
            return (int) (30 * 4 + 40 * Math.floor((float) totalParkingMin / 30));
        }
        return (int) (30 * Math.floor((float) totalParkingMin / 30));
    }
}