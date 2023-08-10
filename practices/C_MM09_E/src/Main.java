import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rawData;
        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            //pass the processed data to methods.
            if (rawData > 31)
                System.out.println("Value of more than 31");
            else
                System.out.println(powOf2(rawData));
        }
    }

    private static int powOf2(int rawData) {
        int two = 2;
        return two << rawData - 1;
    }
}