import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rawData = new int[2];
        //process inputs.
        int i = 0;
        while (sc.hasNextInt()) {
            rawData[i] = sc.nextInt();
            if (i < 1)
                i++;
            else {
                //pass the processed data to methods.
                System.out.println(calcSquareOfTheSum(rawData));
                //reset the index.
                i = 0;
            }
        }
    }

    private static int calcSquareOfTheSum(int[] rawData) {
        int sum = rawData[0] + rawData[1];
        return (int) Math.pow(sum, 2);
    }
}