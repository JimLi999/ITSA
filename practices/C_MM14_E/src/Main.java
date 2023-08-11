import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int rawData;

        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            //pass the processed data to methods.
            int[] result = calcTime(rawData);
            System.out.println(result[0]+" days");
            System.out.println(result[1]+" hours");
            System.out.println(result[2]+" minutes");
            System.out.println(result[3]+" seconds");
        }
    }

    private static int[] calcTime(int rawData) {
        //constant values.
        int minute = 60;
        int hour = 3600;
        int day = 86400;
        //ends

        int days = rawData / day;
        int hours = (rawData % day) / hour;
        int minutes = (rawData % hour) / minute;
        int seconds = rawData % minute;

        return new int[]{days, hours, minutes, seconds};
    }
}