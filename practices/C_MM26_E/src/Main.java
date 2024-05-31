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
            calcMultiply(rawData);

        }
    }

    private static void calcMultiply(int rawData) {
        for (int i = 1; i <= rawData; i++) {
            System.out.printf("%d*%d=%d\n", i, i ,i*i);
        }
    }
}