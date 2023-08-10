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
                System.out.println(rawData[0] + "+" + rawData[1] + "=" + calcAdd(rawData));
                System.out.println(rawData[0] + "*" + rawData[1] + "=" + calcMulti(rawData));
                System.out.println(rawData[0] + "-" + rawData[1] + "=" + calcSub(rawData));
                System.out.println(rawData[0] + "/" + rawData[1] + "=" + calcDiv(rawData) + "..." + calcDivRemind(rawData));
                //reset the index.
                i = 0;
            }
        }
    }

    private static int calcDivRemind(int[] rawData) {
        return rawData[0] % rawData[1];
    }

    private static int calcDiv(int[] rawData) {
        return rawData[0] / rawData[1];
    }

    private static int calcSub(int[] rawData) {
        return rawData[0] - rawData[1];
    }

    private static int calcMulti(int[] rawData) {
        return rawData[0] * rawData[1];
    }

    private static int calcAdd(int[] rawData) {
        return rawData[0] + rawData[1];
    }
}