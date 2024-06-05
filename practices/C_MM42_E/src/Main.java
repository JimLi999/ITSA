import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int[] rawData = new int[2];
        int i = 0;

        //process inputs.
        while (sc.hasNextInt()) {
            if (i < rawData.length - 1) {
                rawData[i] = sc.nextInt();
                i++;
            } else {
                rawData[i] = sc.nextInt();
                System.out.println(calcMatches(rawData));
                i = 0;
            }

        }
    }

    private static int calcMatches(int[] rawData) {
        char[] pattern = String.valueOf(rawData[0]).toCharArray();
        char[] target = String.valueOf(rawData[1]).toCharArray();
        int sum = 0;

        for (int i = 0; i < target.length - 1; i++) {
            if (pattern[0] == target[i] && pattern[1] == target[i + 1]) {
                sum++;
            }
        }

        return sum;

    }
}