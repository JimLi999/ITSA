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
            System.out.println(dec2bin(rawData));

        }
    }

    private static String dec2bin(int rawData) {
        boolean isNegative = rawData < 0;
        StringBuilder str = new StringBuilder();
        int maxDigit = 8;
        int currentDigit = 0;

        if (isNegative)
            rawData = rawData * -1; //ABS

        while (rawData > 0) {
            if ((rawData & 1) == 1) // 1
                str.append('1');
            else // 0
                str.append('0');
            rawData >>= 1;  //Right shift 1 digit.
            currentDigit++;
        }

        while (currentDigit < maxDigit) {
            if(isNegative)
                str.append('1');
            else
                str.append('0');
            currentDigit++;
        }
        return str.reverse().toString();
    }
}