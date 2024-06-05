import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int rawData;

        //process inputs.
        while (sc.hasNextInt()) {
            rawData = sc.nextInt();
            System.out.println(printSum(rawData));
        }
    }

    private static String printSum(int rawData) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 1; i <= rawData; i++) {
            if(i>1){
                strBuilder.append(" + ");
            }
            strBuilder.append(i);
        }
        strBuilder.append(" = ");
        strBuilder.append(calcSum(rawData));
        return strBuilder.toString();
    }

    private static long calcSum(int rawData){
        long sum=0;
        for (int i = 1; i <= rawData; i++) {
            sum+=i;
        }
        return sum;
    }


}