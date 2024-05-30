import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int rawData = 0;

        int i = 0;
        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();

            //pass the processed data to methods.
            System.out.println(dec2hex(rawData));

        }
    }

    private static String dec2hex(int rawData) {
        StringBuilder str = new StringBuilder();
        int remainder = rawData % 16;
        while (rawData > 0) {
            if (remainder < 10)
                str.append((char)(48 + remainder)); //ascii
            else
                str.append((char)(55 + remainder)); //ascii
            rawData = (rawData - remainder) / 16;
            remainder = rawData % 16;
        }

        return str.reverse().toString();
    }
}