import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable
        int i = 0;


        //process inputs.
        while (sc.hasNextInt()) {
            int dataCount=sc.nextInt();
            long[] rawData = new long[dataCount];
            for (int j = 0; j < dataCount; j++) {
                if (i < rawData.length - 1) {
                    rawData[i] = sc.nextInt();
                    i++;
                } else {
                    rawData[i] = sc.nextInt();
                    System.out.print(cacl(rawData));
                    i = 0;
                }
            }
        }
    }

    private static String cacl(long[] rawData){
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < rawData.length; i++) {
            long count = 1;
            long num = 1;
            while ((num %= rawData[i]) != 0){
                count++;
                num=num*10+1;
            }
            strBuilder.append(count).append("\n");
        }
        return strBuilder.toString();
    }

}