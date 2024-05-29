import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int[] rawData = new int[2];

        int i = 0;
        //process inputs.
        while (sc.hasNextInt()) {
            rawData[i] = sc.nextInt();
            if (i < 1)
                i++;
            else {
                //pass the processed data to methods.
                System.out.println(findGCD(rawData));
                i = 0;
            }
        }
    }

    private static int findGCD(int[] rawData) {
        int remain=1;
        if (rawData[0] < rawData[1]) {
            //XOR swap.
            rawData[0]=rawData[0]^rawData[1];
            rawData[1]=rawData[0]^rawData[1];
            rawData[0]=rawData[0]^rawData[1];
        }
        while (remain!=0) {
            //Euclidean algorithm
            remain = rawData[0] % rawData[1];
            rawData[0] = rawData[1];
            rawData[1] = remain;
        }
        return rawData[0];
    }
}