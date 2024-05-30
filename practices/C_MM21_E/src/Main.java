import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int rawData = 0;

        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();

            //pass the processed data to methods.
            System.out.println(factorial(rawData));

        }
    }

    private static long factorial(int rawData) {
        long result=1;
        for (int i = 2; i <= rawData; i++) {
            result*=i;
        }
        return result;
    }
}