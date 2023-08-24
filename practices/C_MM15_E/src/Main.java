import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int[] rawData=new int[2];

        int i=0;
        //process inputs.
        while (sc.hasNextInt()) {
            rawData[i] = sc.nextInt();
            if (i < 1)
                i++;
            else {
                //pass the processed data to methods.
                if(isInSquare(rawData))
                    System.out.println("inside");
                else
                    System.out.println("outside");
                //reset the index.
                i = 0;
            }
        }
    }

    private static boolean isInSquare(int[] rawData) {
        return rawData[0]<=100 && rawData[1]<=100 &&rawData[0]>=0&& rawData[1]>=0;
    }
}